package com.shoping.dbckd.model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import lombok.Data;
@Data
public class CustomerDTO {
    private int iden;               // 식별자
    private String id;              // 아이디
    private String pw;              // 비밀번호
    private String nick;            // 별명
    private String name;            // 이름(본명)
    private String address;         // 주소
    private String phoneCall;      // 휴대전화 번호
    private String generalCall;    // 집 전화번호
    private String email;           // 이메일
    private Date birth;        // 생년월일

    public void setBirth(String date) {
        java.util.Date date2 = null;
        try {
            date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.birth = new java.sql.Date(date2.getTime());
    }
}
