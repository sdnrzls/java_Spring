package com.member.mymodel;

import java.util.HashMap;
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
	public List<MemberVO>list(HashMap<String,String>hm) {
		return dao.dao_list("listData",hm);
	}

	@Override
	public MemberVO findById(String id) {
		return dao.dao_findById("viewData", id);
	}

	@Override
	public void update(MemberVO member) {
		dao.dao_update("updateData", member);
		
	}

	@Override
	public void delete(String id) {
		dao.dao_delete("deleteData", id);
		
	}

}
