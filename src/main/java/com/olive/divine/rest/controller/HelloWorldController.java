package com.olive.divine.rest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.olive.divine.beans.Employee;
import com.olive.divine.service.HelloWorldService;



@RestController
public class HelloWorldController {
	
	@Autowired
	HelloWorldService helloWorldService;

	@RequestMapping(value = "/user/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> updateUser(@PathVariable("name") String name) {
        System.out.println("Updating User " + name);
        Employee e = new Employee();
        e.setLocation("USA");
        e.setName("Niju");
        helloWorldService.insert(e);
        return new ResponseEntity<Employee>(e, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/getuser/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> selectUser(@PathVariable("name") String name) {
        System.out.println("Updating User " + name);
        Employee e = new Employee();
        e.setLocation("USA");
        e.setName(name);
        e  = helloWorldService.select(e);
        return new ResponseEntity<Employee>(e, HttpStatus.OK);
    }
}
