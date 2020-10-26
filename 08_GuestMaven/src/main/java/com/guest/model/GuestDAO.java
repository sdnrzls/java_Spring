package com.guest.model;

import java.util.HashMap;
import java.util.List;

import com.guest.vo.GuestVO;

public interface GuestDAO {
	
		//�߰�
		public void dao_insert(GuestVO guest);
		
		//����
		public void dao_update(GuestVO guest);
		
		//����
		public void dao_delete(int num);
		
		//��ü����(�˻�����)
		public List<GuestVO>dao_list(HashMap<String, Object>hm);
		
		//�󼼺���
		public GuestVO dao_view(int num);
		
		//����
		public int dao_count(HashMap<String, Object>hm);
}
