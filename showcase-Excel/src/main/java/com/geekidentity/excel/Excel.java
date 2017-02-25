package com.geekidentity.excel;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 对Excel实体类对应关系
 * @author geekidentity
 * @date 2017年2月25日
 * @version 1.0
 *
 * @param <T>
 */
public class Excel<T> {
	
	private Class<T> clazz;
	private Map<String, Integer> header;
	public Excel(Class<T> clazz, File file) {
		this.clazz = clazz;
		header = new HashMap<String, Integer>();
		try {
			initHeader(file);
			checkTitle();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TitleNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void initHeader(File file) throws InvalidFormatException, IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(workbook.getActiveSheetIndex());
		Row row = sheet.getRow(sheet.getFirstRowNum());
		int i = row.getFirstCellNum();
		for (Cell cell : row) {
			header.put(cell.getStringCellValue(), i++);
		}
		workbook.close();
	}
	
	private void checkTitle() throws TitleNotFoundException {
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(CellStyle.class)) {
				CellStyle style = field.getDeclaredAnnotation(CellStyle.class);
				if (!header.containsKey(style.title())) {
					throw new TitleNotFoundException(style.title());
				}
			}
			
		}
	}

	public List<T> importFromXls(File file) throws InvalidFormatException, IOException, InstantiationException {
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(workbook.getActiveSheetIndex());
		List<T> list = fillObjects(sheet, true);
		workbook.close();
		return list;
	}

	/**
	 * 生成List
	 * @param sheet
	 * @param header 表格是否有表头
	 * @return
	 * @throws InstantiationException 
	 */
	private List<T> fillObjects(Sheet sheet, boolean header) throws InstantiationException {
		List<T> houseOrigins = new ArrayList<>(sheet.getLastRowNum());
		int start = header ? sheet.getFirstRowNum() + 1 : sheet.getFirstRowNum();
		for (int i = start; i < sheet.getLastRowNum(); i++) {
			try {
				T houseOrigin = fillFields(sheet.getRow(i));
				houseOrigins.add(houseOrigin);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return houseOrigins;
	}

	/**
	 * 填充对象属性
	 * @param row
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws InstantiationException 
	 */
	private T fillFields(Row row) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		T o = clazz.newInstance();
		Field[] fields = o.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(CellStyle.class)) {
				CellStyle style = field.getDeclaredAnnotation(CellStyle.class);
				int index = row.getFirstCellNum() + header.get(style.title());
				Cell cell = row.getCell(index);
				if (cell != null) {
					fillFieldByCell(o, field, cell);
				}
			}
		}
		return o;
	}
	
	/**
	 * 
	 * @param o
	 * @param field
	 * @param cell
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	private Field fillFieldByCell(Object o,Field field, Cell cell) throws IllegalArgumentException, IllegalAccessException {
		field.setAccessible(true);
		@SuppressWarnings("deprecation")
		int type = cell.getCellType();
		Class<?> clazz = field.getType();
		switch (type) {
		case -1: //_NONE
			
			break;
		case 0: //NUMERIC
			double value = cell.getNumericCellValue();
			if (clazz.getSimpleName().equals("Integer")) {
				field.set(o, new Integer((int) value));
			}
			if (clazz.getSimpleName().equals("Double")) {
				field.set(o, value);
			}
			if (clazz.getSimpleName().equals("Date")) {
				Date date = DateUtil.getJavaDate(value);
				field.set(o, date);
			}
			if (clazz.getSimpleName().equals("String")) {
				field.set(o, new Double(value).toString());
			}
			
			break;
		case 1: //STRING
			field.set(o, cell.getStringCellValue());
			break;
		case 2: //FORMULA
			
			break;
		case 3: //BLANK
			
			break;
		case 4: //BOOLEAN
			
			break;
		case 5: //ERROR
			
			break;
		default:
			break;
		}
		return field;
	}
	
	
	
}
