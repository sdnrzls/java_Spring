package com.myboard.model;

import com.myboard.dto.MemberDTO;

public interface MemberService {
	//�߰�
	public int insert(MemberDTO member);
	
	//�α���
	public MemberDTO Login(String id,String pass);
}
