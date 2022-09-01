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
    private String address_eng;     // 영문주소(외국인)
    private String user_phone_first;    // 전화번호 식별자(010 등)
    private String user_phone_second;   // 중간번호
    private String user_phone_third;    // 끝번호
    private String phone_call;      // 휴대전화 번호
    private String general_call;    // 집 전화번호
    private String email;           // 이메일
    private Date birth;        // 생년월일

    public void setPhone_call() {
        try{
            if(this.user_phone_second.length() == 4 && this.user_phone_third.length() == 4){
                this.phone_call = this.user_phone_first + this.user_phone_second + this.user_phone_third;
            } else {
                Exception e = new Exception("전화번호가 비어있습니다.");
                throw e;
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

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
