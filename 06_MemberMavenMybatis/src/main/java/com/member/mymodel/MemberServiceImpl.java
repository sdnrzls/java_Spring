package com.member.mymodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO dao;
	
	@Override
	public void insert(MemberVO member) {
		dao.dao_insert("insertData",member);
	}

	@Override
	public List<MemberVO>list() {
		return dao.dao_list("listData");
	}

	@Override
	public MemberVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
