package com.example.member.controller;

import com.example.member.dto.MemberDTO;
import com.example.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {
    //생성자 주입
    private final MemberService memberService;

    //회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String saveForm() { //대부분 return은 string
        return "save";
    }

    @PostMapping("/member/save") //post방식으로 회원가입을 진행하기 때문
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save"); //단축키 : soutm
        System.out.println("memberDTO = " + memberDTO); //단축키 : soutp
        memberService.save(memberDTO);
        return "index";
    }
}
