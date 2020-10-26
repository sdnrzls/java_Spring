package com.myboard.model;

import java.util.HashMap;
import java.util.List;

import com.myboard.dto.BoardDTO;

public interface BoardService {
	//�߰�
	public int insert(BoardDTO board);
	//����Ʈ
	public List<BoardDTO> findAll(HashMap<String,Object>hm);
	//�󼼺���
	public BoardDTO findByNum(int num);
	//����
	public void update(BoardDTO board);
	//����
	public void delete(int num);
}
