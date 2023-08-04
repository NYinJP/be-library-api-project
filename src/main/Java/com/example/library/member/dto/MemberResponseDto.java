package com.example.library.member.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberResponseDto {
    private long memberId;
    private String name;
    private String phone;
    private String email;
}
