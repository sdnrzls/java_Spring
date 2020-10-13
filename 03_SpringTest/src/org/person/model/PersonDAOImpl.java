package org.person.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAOImpl implements PersonDAO{
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public void personInsert(PersonVO person) {
		String sql = "insert into person values(?,?,?,?,?)";
		Object[] param = new Object[] {
				person.getId(),
				person.getName(),
				person.getPassword(),
				person.getGender(),
				person.getJob()
		};
		template.update(sql,param);
	}

	@Override
	public void personUpdate(PersonVO person) {
		String sql="update person  set name=?, job=?,password=? where id=?";
		Object[] param = new Object[] {
				person.getName(),
				person.getJob(),
				person.getPassword(),
				person.getId()
		};
		template.update(sql,param);
		
	}

	@Override
	public void personDelete(String id) {
		String sql = "delete from person where id='"+id+"'";
		template.update(sql);
	}

	@Override
	public List<PersonVO> personList() {
		String sql="select * from person";
		List<PersonVO>perlist = template.query(sql,new RowMapper<PersonVO>() {

			@Override
			public PersonVO mapRow(ResultSet rs, int arg1) throws SQLException {
				PersonVO user = new PersonVO();
				user.setGender(rs.getString("gender"));
				user.setId(rs.getString("id"));
				user.setJob(rs.getString("job"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				return user;
			}
		});
		return perlist;
	}

	@Override
	public PersonVO personDetail(String id) {
		String sql = "select * from person where id='"+id+"'";
		PersonVO person = template.queryForObject(sql, new RowMapper<PersonVO>(){

			@Override
			public PersonVO mapRow(ResultSet rs, int arg1) throws SQLException {
				PersonVO user = new PersonVO();
				user.setId(rs.getString("id"));
				user.setGender(rs.getString("gender"));
				user.setJob(rs.getString("job"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				return user;
			}
		});
		return person;
	}

}
