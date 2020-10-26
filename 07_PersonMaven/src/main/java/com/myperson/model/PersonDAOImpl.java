package com.myperson.model;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAOImpl implements PersonDAO{
	@Autowired
	private SqlSessionFactory sqlMapper;
	
	@Override
	public void personInsert(String sqlId,Person person) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.insert(sqlId,person);
		sess.commit();
	}

	@Override
	public void personUpdate(String sqlId,Person person) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.insert(sqlId,person);
		sess.commit();
	}

	@Override
	public void personDelete(String sqlId,String id) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.insert(sqlId,id);
		sess.commit();
	}

	@Override
	public List<Person> personList(String sqlId,HashMap<String,String>hm) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		List<Person>list = sess.selectList(sqlId,hm);
		return list;
	}

	@Override
	public Person personDetail(String sqlId,String id) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		Person person = sess.selectOne(sqlId, id);
		return person;
	}

}
