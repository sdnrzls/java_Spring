package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.model.Signup;
import com.example.demo.repository.AdminRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminService {
	private final AdminRepository adminre;
	
	@Transactional
	public void save(Signup admin) {
		adminre.save(admin);
	}
	public List<Signup> list(){
		return adminre.findAll();
	}
	public Page<Signup> list(Pageable pageable){
		return adminre.findAll(pageable);
	}
	public Signup detail(String id) {
		return adminre.findById(id)
				.orElseThrow(()->{
					return new IllegalArgumentException("글 상세보기 실패");
				});
	}
	@Transactional
	public void update(Signup signup) {
		Signup s=adminre.findById(signup.getId())
			.orElseThrow(()->{
					return new IllegalArgumentException("찾기 실패:아이디 없음");
	});
		s.setPassword(signup.getPassword());
		s.setName(signup.getName());
		s.setAddress(signup.getAddress());
		s.setPhone(signup.getPhone());
		s.setEmail(signup.getEmail());
	}
	public void delete(String id) {
		// TODO Auto-generated method stub
		adminre.deleteById(id);
	}
}
