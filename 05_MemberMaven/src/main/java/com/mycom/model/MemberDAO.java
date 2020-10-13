package com.mycom.model;

import java.util.List;

public interface MemberDAO {
	
	//�߰�
	public void dao_insert(Member member);
	
	//��ü����
	public List<Member>dao_list(String field,String word);
	
	//�󼼺���
	public Member dao_findById(String id);
	
	//����
	public void dao_update(Member member);
	
	//����
	public void dao_delete(String id);
}
