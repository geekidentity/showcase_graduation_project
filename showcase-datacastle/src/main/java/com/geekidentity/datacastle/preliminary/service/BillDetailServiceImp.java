package com.geekidentity.datacastle.preliminary.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geekidentity.datacastle.preliminary.entity.BillDetail;
import com.geekidentity.showcase.common.service.BaseServiceImp;

/**
 * 
 * @author geekidentity
 * @date 2017年4月4日
 * @version 1.0
 *
 */
@Service
@Transactional
public class BillDetailServiceImp extends BaseServiceImp<BillDetail> implements BillDetailService {
	@Override
	public void importData(File file) {
		List<BillDetail> billDetails = new ArrayList<>(14000);
		BufferedReader reader = null;
		try {
			FileReader in = new FileReader(file);
			reader = new BufferedReader(in);
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] t = line.split(",");
				String[] result = new String[t.length];
				for (int i = 0; i < t.length; i++) {
					result[i] = t[i];
				}
				BillDetail bankDetail = new BillDetail(Integer.valueOf(result[0]), Long.valueOf(result[1]), Integer.valueOf(result[2]),
						Double.valueOf(result[3]), Double.valueOf(result[4]), Double.valueOf(result[5]), Double.valueOf(result[6]), Double.valueOf(result[7]),
						Integer.valueOf(result[8]),
						Double.valueOf(result[9]), Double.valueOf(result[10]), Double.valueOf(result[11]), Double.valueOf(result[12]), Double.valueOf(result[13]),
						Integer.valueOf(result[14]));
				billDetails.add(bankDetail);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		baseDao.batchSave(billDetails);
		
	}
}
