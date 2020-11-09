package com.myboard.model;

import java.util.HashMap;
import java.util.List;

import com.myboard.dto.BoardDTO;
import com.myboard.util.SearchDTO;

public interface BoardDAO {
	//�߰�
	public int dao_insert(BoardDTO board);
	//����Ʈ
	public List<BoardDTO>dao_findAll(SearchDTO dto);
	//�󼼺���
	public BoardDTO dao_findByNum(int num);
	//����
	public void dao_update(BoardDTO board);
	//����
	public void dao_delete(int num);
	//����
	public int getCount(SearchDTO dto);
}
