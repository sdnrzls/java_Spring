package com.myguest.model;

import java.util.HashMap;
import java.util.List;


public interface GuestBookDAO {
	//�߰�
	public void dao_guestInsert(GuestBookDTO gb);
		
	//��ü����(�˻�����)
	public List<GuestBookDTO>dao_list(HashMap<String, Object>hm);
		
	//�󼼺���
	public GuestBookDTO dao_findByNum(int num);
	
	//����
	public void dao_updateGuest(GuestBookDTO gb);
			
	//����
	public void dao_deleteGuest(int num);
		
	//����
	public int dao_countGuest(HashMap<String, Object>hm);
}
