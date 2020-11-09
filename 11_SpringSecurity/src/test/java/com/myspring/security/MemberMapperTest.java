package com.myspring.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myspring.dto.MemberDTO;
import com.myspring.mapper.MemberMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({	
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml"})
@Log4j
public class MemberMapperTest {
	@Setter(onMethod_=@Autowired)
	private MemberMapper mapper;
	@Test
	public void testRead() {
		MemberDTO member = mapper.read("admin90");
		log.info(member);
		member.getAuthList().forEach(authVO -> log.info(authVO));
	}

}
