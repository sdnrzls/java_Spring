package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Signup;

public interface AdminRepository extends JpaRepository<Signup, String>{

}
