package com.member.model;

import java.util.List;

public interface MemberDAO {
	//�߰�
	public void insert(Member user);
	
	//��ü����
	public List<Member> getMemberList();
	
	//�󼼺���
	public Member findById(String id);
	
	//����
	public void update(Member user);
	
	//����
	public void delete(String id);
}
