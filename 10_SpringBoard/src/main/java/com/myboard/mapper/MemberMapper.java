package com.myboard.mapper;

import org.apache.ibatis.annotations.Param;

import com.myboard.dto.MemberDTO;

public interface MemberMapper {
	//�߰�
	public int insert(MemberDTO member);
	
	//�α���
	public MemberDTO Login(@Param("id")String id,@Param("pass") String pass);
}
