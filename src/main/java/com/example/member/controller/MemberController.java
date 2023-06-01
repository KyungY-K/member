package com.example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    //회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String saveForm() { //대부분 return은 string
        return "save";
    }

    @PostMapping("/member/save") //post방식으로 회원가입을 진행하기 때문
    public String save(@RequestParam("memberEmail") String memberEmail,
                        @RequestParam("memberPassword") String memberPassword,
                        @RequestParam("memberName") String memberName) {
        System.out.println("MemberController.save"); //단축키 : soutm
        System.out.println("memberEmail = " + memberEmail + ", memberPassword = " + memberPassword + ", memberName = " + memberName); //단축키 : soutp
        return "index";
    }
}
