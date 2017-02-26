package com.geekidentity.datacastle.house.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geekidentity.datacastle.house.dao.HouseOriginDao;
import com.geekidentity.datacastle.house.entity.HouseOrigin;

@Service
@Transactional
public class HouseOriginService {
	
	@Autowired
	private HouseOriginDao houseOriginDao;
	
	public HouseOrigin get(Integer id) {
		return null;
	}
	
	public void create(HouseOrigin house) {
		try {
			houseOriginDao.create(house);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
