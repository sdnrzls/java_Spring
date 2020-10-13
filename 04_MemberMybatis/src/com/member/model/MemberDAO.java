package com.member.model;

import java.util.List;

public interface MemberDAO {

	//�߰�
	public void dao_inset(String sqlId,MemberVO member);
	
	//��ü����
	public List<MemberVO>dao_list(String sqlId);
	
	//�󼼺���
	public MemberVO dao_view(String sqlId,String id);
	
	//����
	public void dao_update(String sqlId,MemberVO member);
	
	//����
	public void dao_delete(String sqlId,String id);
}
