package com.member.mymodel;

import java.util.List;


public interface MemberDAO {
		//추가
		public void dao_insert(String sqlId,MemberVO member);
		
		//전체보기
		public List<MemberVO>dao_list(String sqlId);
		
		//상세보기
		public MemberVO dao_findById(String sqlId,String id);
		
		//수정
		public void dao_update(String sqlId,MemberVO member);
		
		//삭제
		public void dao_delete(String sqlId,String id);
}
