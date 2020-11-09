package com.myboard.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myboard.dto.MemberDTO;
import com.myboard.mapper.MemberMapper;
@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberMapper mmapper;

	@Override
	public int insert(MemberDTO member) {	
		return mmapper.insert(member);
	}

	@Override
	public MemberDTO Login(String id, String pass) {
		return mmapper.Login(id, pass);
	}

}
