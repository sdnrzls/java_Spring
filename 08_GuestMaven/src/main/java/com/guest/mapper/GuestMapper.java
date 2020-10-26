package com.guest.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.guest.vo.GuestVO;

public interface GuestMapper {
	
	//추가
	@Insert("insert into guestbook values(guestbook_seq.nextval,#{name},#{content},#{grade},sysdate,#{ipaddr})")
	public void insert(GuestVO guest);
	
	//전체보기(검색포함)
	public List<GuestVO>list(HashMap<String, Object>hm);
	
	//갯수
	public int count(HashMap<String, Object>hm);
	
	//상세보기
	public GuestVO view(int num);
	
	//수정
	public void update(GuestVO guest);
	
	//삭제
	public void delete(int num);
	
	
}
