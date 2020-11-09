package com.myboard.model;

import com.myboard.dto.MemberDTO;

public interface MemberService {
	//추가
	public int insert(MemberDTO member);
	
	//로그인
	public MemberDTO Login(String id,String pass);
}
