package com.myboard.mapper;

import java.util.List;

import com.myboard.dto.CommentDTO;

public interface CommentMapper {
	
	public int insert(CommentDTO cnt);
	
	public List<CommentDTO> getList(int bnum);
	
	public void delete(int cnum);
	//read
	public CommentDTO read(int cnum);
}
