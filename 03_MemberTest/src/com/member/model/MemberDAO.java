package com.member.model;

import java.util.List;

public interface MemberDAO {
	//추가
	public void insert(Member user);
	
	//전체보기
	public List<Member> getMemberList();
	
	//상세보기
	public Member findById(String id);
	
	//수정
	public void update(Member user);
	
	//삭제
	public void delete(String id);
}
