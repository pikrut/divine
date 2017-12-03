package com.olive.divine.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.olive.divine.beans.Employee;

@Service
public interface HelloWorldService {
	int insert (Employee e);

	Employee select(Employee e);
}
