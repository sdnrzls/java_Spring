package com.myperson.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	private PersonDAO dao;
	
	@Override
	public void person_insert(Person person) {
		dao.personInsert("insertData",person);
	}

	@Override
	public void person_update(Person person) {
		dao.personUpdate("updateData", person);
	}

	@Override
	public void person_delete(String id) {
		dao.personDelete("deleteData", id);
	}

	@Override
	public List<Person> person_list(HashMap<String,String>hm) {
		return dao.personList("listData",hm);
	}

	@Override
	public Person person_detail(String id) {
		return dao.personDetail("detailData", id);
	}

}
