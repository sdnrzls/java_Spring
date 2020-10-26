package com.myguest.mapper;

import java.util.HashMap;
import java.util.List;

import com.myguest.model.GuestBookDTO;

public interface GuestBookMapper {
	//추가
	public void insert(GuestBookDTO gb);
	
	//전체보기(검색포함)
	public List<GuestBookDTO>list(HashMap<String, Object>hm);
	
	//갯수
	public int count(HashMap<String,Object>hm);
	
	//상세보기
	public GuestBookDTO view(int num);
	
	//수정
	public void update(GuestBookDTO gb);
	
	//삭제
	public void delete(int num);
}
