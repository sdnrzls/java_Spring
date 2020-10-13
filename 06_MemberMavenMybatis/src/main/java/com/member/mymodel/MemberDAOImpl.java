package com.member.mymodel;

import java.util.List;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDAOImpl implements MemberDAO{
	@Autowired
	private SqlSessionFactory sqlMapper;
	
	@Override
	public void dao_insert(String sqlId,MemberVO member) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.insert(sqlId,member); //sqlId="insertData"
		sess.commit();
	}

	@Override
	public List<MemberVO> dao_list(String sqlId) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		List<MemberVO>list = sess.selectList(sqlId);
		return list;
	}

	@Override
	public MemberVO dao_findById(String sqlId,String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dao_update(String sqlId,MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dao_delete(String sqlId,String id) {
		// TODO Auto-generated method stub
		
	}

}
