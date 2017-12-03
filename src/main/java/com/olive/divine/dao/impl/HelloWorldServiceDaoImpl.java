package com.olive.divine.dao.impl;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import com.olive.divine.beans.Employee;
import com.olive.divine.dao.HelloWorldServiceDao;

@Repository
public class HelloWorldServiceDaoImpl implements HelloWorldServiceDao{

	@Autowired
	MongoDatabase database;
	
	public int insert(Employee e) {
		// TODO Auto-generated method stub
		System.out.println(database.getName());
		MongoCollection<Document> collection = database.getCollection("Employee");
		
		Gson gson = new Gson();
		String json  = gson.toJson(e);
		Document doc = Document.parse( json.toString() );
		collection.insertOne(doc);
		System.out.println(json);
		return 0;
	}
	
	public Employee select(Employee e) {
		// TODO Auto-generated method stub
		MongoCollection<Document> collection = database.getCollection("Employee");
		FindIterable<Document> doc = collection.find();
		System.out.println(doc.toString()+"=="+ doc.first());
		return e;
	}

}
