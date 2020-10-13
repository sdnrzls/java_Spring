package org.person.model;

import java.util.List;

public interface PersonDAO {
		
		//�߰�
		public void personInsert(PersonVO person);
		//����
		public void personUpdate(PersonVO person);
		//����
		public void personDelete(String id);
		//��ü����
		public List<PersonVO>personList();
		//�󼼺���
		public PersonVO personDetail(String id);
}
