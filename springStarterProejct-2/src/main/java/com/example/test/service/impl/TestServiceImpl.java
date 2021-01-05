package com.example.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.mapper.TestDao;
import com.example.test.model.Member;
import com.example.test.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestDao testDao;
	
	@Override
	public void saveMember(Member member) throws Exception {
		try {
			testDao.saveMember(member);
		} catch(Exception e) {
		}
	}

}
