package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Member;
import com.example.demo.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {


	private final MemberMapper memberMapper;

	public List<Member> getAllUsers() {
		return memberMapper.getAllMembers();
	}

}
