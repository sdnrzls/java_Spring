package com.mycom.model;

import java.util.List;

public interface MemberService {
	//�߰�
	public void insert(Member member);
	
	//��ü����
	public List<Member>list(String field,String word);
	
	//�󼼺���
	public Member findById(String id);
	
	//����
	public void update(Member member);
	
	//����
	public void delete(String id);
}
