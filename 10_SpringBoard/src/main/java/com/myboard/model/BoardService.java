package com.myboard.model;
import java.util.List;
import com.myboard.dto.BoardDTO;
import com.myboard.util.SearchDTO;

public interface BoardService {
	//�߰�
	public int insert(BoardDTO board);
	//����Ʈ
	public List<BoardDTO>findAll(SearchDTO dto);
	//�󼼺���
	public BoardDTO findByNum(int num);
	//����
	public void update(BoardDTO board);
	//����
	public void delete(int num);
	//����
	public int getCount(SearchDTO dto);
	
}
