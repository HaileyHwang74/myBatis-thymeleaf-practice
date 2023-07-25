package com.example.demo.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemeberController {
	
    private final MemberService memberService;


    @GetMapping("/")
    public List<Member> getMemberList(Model model) {
        List<Member> members = memberService.getAllUsers();
        model.addAttribute("members", members);
        return members;
    }
}