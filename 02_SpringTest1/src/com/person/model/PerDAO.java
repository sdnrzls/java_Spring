package com.person.model;

import java.util.List;

public interface PerDAO {

	//�߰�
	public void perInsert(Person p);
	//��ü����
	public List<Person>perList();
	//����
	public void PerUpdate(Person p);
	//����
	public void perDelete(String id);
	//�󼼺���
	public Person perView(String id);
}
