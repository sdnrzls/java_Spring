package com.myboard.model;
import java.util.List;
import com.myboard.dto.BoardDTO;
import com.myboard.util.SearchDTO;

public interface BoardService {
	//추가
	public int insert(BoardDTO board);
	//리스트
	public List<BoardDTO>findAll(SearchDTO dto);
	//상세보기
	public BoardDTO findByNum(int num);
	//수정
	public void update(BoardDTO board);
	//삭제
	public void delete(int num);
	//갯수
	public int getCount(SearchDTO dto);
	
}
