package com.mycom.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO dao;
	
	
	@Override
	public void insert(Member member) {
		dao.dao_insert(member);
	}

	@Override
	public List<Member> list(String field,String word) {
		return dao.dao_list(field,word);
	}

	@Override
	public Member findById(String id) {
		return dao.dao_findById(id);
	}

	@Override
	public void update(Member member) {
		 dao.dao_update(member);
	}

	@Override
	public void delete(String id) {
		dao.dao_delete(id);
	}

}
