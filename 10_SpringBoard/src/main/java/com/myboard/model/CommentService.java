package com.myboard.model;

import java.util.List;

import com.myboard.dto.BoardDTO;
import com.myboard.dto.CommentDTO;

public interface CommentService {
	
	//추가
	public void insert(CommentDTO cnt);
	//리스트
	public List<CommentDTO>getList(int bnum);
	//삭제
	public void delete(int num);
	
}
