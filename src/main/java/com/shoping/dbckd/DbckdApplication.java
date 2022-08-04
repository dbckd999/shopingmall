package com.shoping.dbckd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 프로그램을 시작하면 가장먼저 시작하게 된다.
// 건드릴 일은 거의 없다.

// con.shoping.dbckd 아래의 controller, service, model, mapper 순으로 코드를 보는것을 추천함.

// src/main/resources/ 의 파일구조 설명
// mapper: 각종 쿼리문을 모으는 폴더
// static js, css파일을 모으는 폴더
// template: html파일을 모으는 폴더

// *개인적으로 spring boot application 실행문이 안보여서 적음
// 여기서 우클릭 후 run as > java application을 바로 실행해도 된다.

// spring boot를 실행한 채 파일을 작성(수정)하고 저장하면 콘솔쪽이 뭔가 올라오는데, 바뀐 파일을 반영하는 과정이다.
// 가끔 안되는 경우도 있다고 하는데 수틀리면 서버 닫고 다시 열자.

// console탭 에 올라오는 로그파일도 읽으면 도움이 될것이다.

@SpringBootApplication
public class DbckdApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbckdApplication.class, args);
	}

}
