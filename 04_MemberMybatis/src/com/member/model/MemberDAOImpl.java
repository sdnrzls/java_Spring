package com.member.model;

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
	public void dao_inset(String sqlId, MemberVO member) {
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
	public MemberVO dao_view(String sqlId, String id) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		MemberVO member = sess.selectOne(sqlId, id);
		return member;
	}

	@Override
	public void dao_update(String sqlId, MemberVO member) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.insert(sqlId,member);
		sess.commit();	
	}

	@Override
	public void dao_delete(String sqlId, String id) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.insert(sqlId,id);
		sess.commit();
	}

}
