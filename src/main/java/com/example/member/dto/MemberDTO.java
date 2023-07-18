package com.example.member.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor  //기본생성자를 자동으로 만들어주는 기능
@AllArgsConstructor //필드를 모두 다 매게변수로 하는 생성자를 만들어주는 기능
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
