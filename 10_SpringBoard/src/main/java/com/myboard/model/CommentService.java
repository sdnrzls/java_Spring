package com.myboard.model;

import java.util.List;

import com.myboard.dto.BoardDTO;
import com.myboard.dto.CommentDTO;

public interface CommentService {
	
	//�߰�
	public void insert(CommentDTO cnt);
	//����Ʈ
	public List<CommentDTO>getList(int bnum);
	//����
	public void delete(int num);
	
}
