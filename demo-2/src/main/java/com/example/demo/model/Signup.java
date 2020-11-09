package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
public class Signup {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String password;
	private String name;
	private String phone;
	private String address;
	private String email;

}
