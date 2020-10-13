package com.member.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public void insert(Member member) {
		String sql = "insert into member(id,pass,name,addr,memo,reg_date) "
				+ "values(?,?,?,?,?,sysdate)";
		Object[] param = new Object[] {
				member.getId(),
				member.getPass(),
				member.getName(),
				member.getAddr(),
				member.getMemo()
				
		};
		template.update(sql,param);
	}

	@Override
	public List<Member> getMemberList() {
		String sql="select*from member";
		List<Member>memlist = template.query(sql,new RowMapper<Member>(){

			@Override
			public Member mapRow(ResultSet rs, int arg1) throws SQLException {
				Member mem = new Member();
				mem.setId(rs.getString("id"));
				mem.setPass(rs.getString("pass"));
				mem.setName(rs.getString("name"));
				mem.setAddr(rs.getString("addr"));
				mem.setMemo(rs.getString("memo"));
				mem.setReg_date(rs.getString("reg_date"));
				return mem;
			}
			
		});
		return memlist;
		
	}

	@Override
	public Member findById(String id) {
		String sql = "select * from member where id='"+id+"'";
		Member members = template.queryForObject(sql, new RowMapper<Member>() {
			@Override
			public Member mapRow(ResultSet rs, int arg1) throws SQLException {
				Member member = new Member();
				member.setAddr(rs.getString("addr"));
				member.setId(rs.getString("id"));
				member.setMemo(rs.getString("memo"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setReg_date(rs.getString("reg_date"));
				return member;
			}
		});
		return members;
	}

	@Override
	public void update(Member member) {
		String sql = "update member set name=?,addr=?,pass=?,memo=? where id=?";
		Object[] param = new Object[] {
				member.getName(),member.getAddr(),
				member.getPass(),member.getMemo(),
				member.getId()
		};
		template.update(sql,param);
		
	}

	@Override
	public void delete(String id) {
		String sql = "delete from member where id='"+id+"'";
		template.update(sql);
	}

}
