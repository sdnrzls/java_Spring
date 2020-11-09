package com.example.demo1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo1.dao.DeptDao;
import com.example.demo1.vo.DeptVO;

import lombok.Builder;

@Service
public class DeptServiceImpl implements DeptService {
	
	private DeptDao deptDao;
	@Builder
	public DeptServiceImpl(DeptDao deptDao) {
		super();
		this.deptDao = deptDao;
	}
	
	
	@Override
	public List<DeptVO> list() {
		return deptDao.list();
	}

}
