package com.myboard.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myboard.dto.BoardDTO;
import com.myboard.mapper.BoardMapper;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Autowired BoardMapper mapper;
	

	@Override
	public int dao_insert(BoardDTO board) {
		return mapper.insert(board);
	}

	@Override
	public List<BoardDTO> dao_findAll(HashMap<String, Object> hm) {
		return mapper.findAll(hm);
	}

	@Override
	public BoardDTO dao_findByNum(int num) {
		return mapper.findByNum(num);
	}

	@Override
	public void dao_update(BoardDTO board) {
		mapper.update(board);
	}

	@Override
	public void dao_delete(int num) {
		mapper.delete(num);
	}

}
