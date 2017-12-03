package com.olive.divine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olive.divine.beans.Employee;
import com.olive.divine.dao.HelloWorldServiceDao;
import com.olive.divine.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{
	@Autowired
	HelloWorldServiceDao helloWorldServiceDao;
	
	public int insert(Employee e) {
		// TODO Auto-generated method stub
		int insert = helloWorldServiceDao.insert(e);
		return 0;
	}

	public Employee select(Employee e) {
		// TODO Auto-generated method stub
		e = helloWorldServiceDao.select(e);
		return e;
	}

}
