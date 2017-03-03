package com.geekidentity.datacastle.tender.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geekidentity.datacastle.tender.entity.ProjectTender;
import com.geekidentity.showcase.common.service.BaseServiceImp;

@Service
@Transactional
public class ProjectTenderServiceImp extends BaseServiceImp<ProjectTender> implements ProjectTenderService {

	@Override
	public void insertFromTxt(File file) {
		List<ProjectTender> list = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			list = new ArrayList<>();
			reader.readLine();
			while((line = reader.readLine()) != null) {
				int i = 0;
				String[] values = line.split("\"	\"");
				ProjectTender tender = new ProjectTender();
				String idStr = values[i++].substring(1);
				tender.setId(Integer.valueOf(idStr));
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
				try {
					tender.setReleaseDate(dateFormat.parse(values[i++]));
				} catch (Exception e) {
					// TODO: handle exception
				}
				tender.setTitle(values[i++]);
				tender.setType(values[i++]);
				tender.setRegion(values[i++]);
				tender.setBiddingCompany(values[i++]);
				tender.setAgentCompany(values[i++]);
				tender.setTenderCompany(values[i++]);
				tender.setBiddingNumber(values[i++]);
				tender.setMoney(values[i++]);
				tender.setSourceUrl(values[i++]);
				tender.setBiddingContent(values[i++]);
				String oldIdStr = values[i++];
				oldIdStr = oldIdStr.substring(0, oldIdStr.length()-1);
				tender.setOldId(Integer.valueOf(oldIdStr));
				list.add(tender);
			}
			
			reader.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		batchSave(list);
	}

}
