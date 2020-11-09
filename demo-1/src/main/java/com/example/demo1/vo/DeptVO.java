package com.example.demo1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeptVO {
	@JsonProperty
	private int deptno;
	@JsonProperty
	private String dname;
	@JsonProperty
	private String loc;

}
