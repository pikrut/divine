package com.olive.divine.dao;

import org.springframework.stereotype.Repository;

import com.olive.divine.beans.Employee;

@Repository
public interface HelloWorldServiceDao {
	int insert (Employee e);

	Employee select(Employee e);
}
