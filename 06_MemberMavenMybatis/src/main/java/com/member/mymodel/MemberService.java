package com.member.mymodel;

import java.util.List;


public interface MemberService {
	//�߰�
		public void insert(MemberVO member);
		
		//��ü����
		public List<MemberVO>list();
		
		//�󼼺���
		public MemberVO findById(String id);
		
		//����
		public void update(MemberVO member);
		
		//����
		public void delete(String id);
}
