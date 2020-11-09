package com.myboard.mapper;

import org.apache.ibatis.annotations.Param;

import com.myboard.dto.MemberDTO;

public interface MemberMapper {
	//추가
	public int insert(MemberDTO member);
	
	//로그인
	public MemberDTO Login(@Param("id")String id,@Param("pass") String pass);
}
