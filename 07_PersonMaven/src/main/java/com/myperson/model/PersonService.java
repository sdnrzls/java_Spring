package com.myperson.model;

import java.util.HashMap;
import java.util.List;

public interface PersonService {
		//�߰�
		public void person_insert(Person person);
		//����
		public void person_update(Person person);
		//����
		public void person_delete(String id);
		//��ü����
		public List<Person>person_list(HashMap<String,String>hm);
		//�󼼺���
		public Person person_detail(String id);
}
