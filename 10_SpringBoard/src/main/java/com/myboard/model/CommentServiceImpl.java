package com.myboard.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myboard.dto.CommentDTO;
import com.myboard.mapper.BoardMapper;
import com.myboard.mapper.CommentMapper;

@Service
public class CommentServiceImpl implements CommentService {
@Autowired 
private CommentMapper cmapper;
@Autowired
private BoardMapper bmapper;

	@Override
	public List<CommentDTO> getList(int bnum) {
		return cmapper.getList(bnum);
	}
	
	@Override
	@Transactional
	public void insert(CommentDTO cnt) {
		bmapper.updateReplyCnt(cnt.getBnum(),1);
		cmapper.insert(cnt);
	}
	
	@Override
	@Transactional
	public void delete(int cnum) {
		//상세보기
		CommentDTO cnt = cmapper.read(cnum);
		bmapper.updateReplyCnt(cnt.getBnum(),-1);
		
		cmapper.delete(cnum);
	}

}
