package com.myguest.mapper;

import java.util.HashMap;
import java.util.List;

import com.myguest.model.GuestBookDTO;

public interface GuestBookMapper {
	//�߰�
	public void insert(GuestBookDTO gb);
	
	//��ü����(�˻�����)
	public List<GuestBookDTO>list(HashMap<String, Object>hm);
	
	//����
	public int count(HashMap<String,Object>hm);
	
	//�󼼺���
	public GuestBookDTO view(int num);
	
	//����
	public void update(GuestBookDTO gb);
	
	//����
	public void delete(int num);
}
