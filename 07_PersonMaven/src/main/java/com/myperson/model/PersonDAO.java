package com.myperson.model;

import java.util.HashMap;
import java.util.List;

public interface PersonDAO {
			//�߰�
			public void personInsert(String sqlId,Person person);
			//����
			public void personUpdate(String sqlId,Person person);
			//����
			public void personDelete(String sqlId,String id);
			//��ü����
			public List<Person>personList(String sqlId,HashMap<String,String>hm);
			//�󼼺���
			public Person personDetail(String sqlId,String id);
}
