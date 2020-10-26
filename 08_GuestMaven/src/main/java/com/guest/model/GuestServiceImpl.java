package com.guest.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guest.vo.GuestVO;

@Service
public class GuestServiceImpl implements GuestService{
	@Autowired
	private GuestDAO dao;

	@Override
	public void insert(GuestVO guest) {
		dao.dao_insert(guest);
	}

	@Override
	public void update(GuestVO guest) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(int num) {
		dao.dao_delete(num);
	}

	@Override
	public List<GuestVO> list(HashMap<String, Object> hm) {
		return dao.dao_list(hm);
	}

	@Override
	public GuestVO view(int num) {
		return dao.dao_view(num);
	}

	@Override
	public int count(HashMap<String, Object> hm) {
		return dao.dao_count(hm);
	}
	
}
