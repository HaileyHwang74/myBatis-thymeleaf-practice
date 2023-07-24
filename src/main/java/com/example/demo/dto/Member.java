package com.example.demo.dto;

import lombok.Data;

@Data
public class Member {
	private Long id;
	private String memberId;
	private String name;
	private String email;
	private int age;	
}
