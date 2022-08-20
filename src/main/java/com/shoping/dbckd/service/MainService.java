package com.shoping.dbckd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoping.dbckd.mapper.MainMapper;

// 데이터베이스에서 가져온 데이터를 가공하는 곳이다.
// 이곳에선 바로 클래스를 만들지만, 팀워크를 위해 인터페이스를 만들어 설계도를 먼저 만들고 상속받은 다음 구현하는 것을 추천한다.

@Service
public class MainService {
	
	@Autowired
	private MainMapper mapper;
	
	public List<Integer> test() {
		return mapper.getMember();
	}
	
	public String loginRes(String id, String pw) {
		return mapper.loginRes(id, pw);
	}
}
