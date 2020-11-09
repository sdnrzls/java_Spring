package com.myboard.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myboard.dto.BoardDTO;
import com.myboard.util.SearchDTO;

public interface BoardMapper {
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
		//댓글수정
		public void updateReplyCnt(@Param("bnum")int bnum,@Param("amount")int amount);
		
}
