package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Member;

@Mapper
public interface MemberMapper {
	List<Member> getAllMembers();
	
}
