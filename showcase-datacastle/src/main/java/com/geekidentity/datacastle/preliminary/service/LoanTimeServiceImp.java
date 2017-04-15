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

import com.geekidentity.datacastle.preliminary.entity.LoanTime;
import com.geekidentity.datacastle.preliminary.entity.LoanTimeDailyModel;
import com.geekidentity.showcase.common.service.BaseServiceImp;

/**
 * 
 * @author geekidentity
 * @date 2017年4月9日
 * @version 1.0
 *
 */
@Service
@Transactional
public class LoanTimeServiceImp extends BaseServiceImp<LoanTime> implements LoanTimeService {
	
	@Override
	public void importData(File file) {
		List<LoanTime> loanTimes = new ArrayList<>(14000);
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
				int i = 0;
				LoanTime user = new LoanTime(Integer.valueOf(result[i++]), Long.valueOf(result[i++]));
				loanTimes.add(user);
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
		baseDao.batchSave(loanTimes);
	}

	@Override
	public List<LoanTimeDailyModel> dailyData() {
		String sql = "SELECT loanTime, count(*) FROM datacastle.loan_time_train group by loanTime;";
		List<LoanTimeDailyModel> result = baseDao.findBySqlOfCustomizeType(sql);
		return result;
	}
}
