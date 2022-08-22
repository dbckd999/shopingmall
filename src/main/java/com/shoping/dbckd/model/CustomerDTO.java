package com.shoping.dbckd.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class CustomerDTO {
    private int iden;               // 식별자
    private String id;              // 아이디
    private String pw;              // 비밀번호
    private String nick;            // 별명
    private String name;            // 이름(본명)
    private String address;         // 주소
    private String address_eng;     // 영문주소(외국인)
    private String phone_call;      // 휴대전화 번호
    private String general_call;    // 집 전화번호
    private String email;           // 이메일
    private Timestamp birth;        // 생년월일
}
