package com.example.demo.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

@ApiResponses({
    @ApiResponse(code = 200, message = "Success"),
    @ApiResponse(code = 400, message = "Bad Request"),
    @ApiResponse(code = 500, message = "Internal Server Error")
})
@Api(tags = {"1.Member"})
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1")
public class MemeberController {
	
    private final MemberService memberService;

    @ApiOperation(value = "회원 전체 조회", notes = "전체 회원을 조회합니다.")
    @GetMapping("/member")
    public List<Member> getMemberList(Model model) {
        List<Member> members = memberService.getAllUsers();
        model.addAttribute("members", members);
        return members;
    }
}