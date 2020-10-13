package com.person.model;

import java.util.List;

public interface PersonDAO{
	//�߰�
	public void personInsert(PersonDTO person);
	//��ü����
	public List<PersonDTO>findAll();
	//����
	public void PersonUpdate(PersonDTO person);
	//����
	public void personDelete(String id);
	//�󼼺���
	public PersonDTO findById(String id);
}
