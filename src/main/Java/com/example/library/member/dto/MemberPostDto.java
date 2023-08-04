package com.example.library.member.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class MemberPostDto {
    private String name;
    private String phone;
    @Email
    private String email;
}
