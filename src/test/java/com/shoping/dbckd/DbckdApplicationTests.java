package com.shoping.dbckd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shoping.dbckd.mapper.MainMapper;
import com.shoping.dbckd.service.MainService;

// 웹에서 실행하지 않고 간단한 코드로 입출력을 테스트 한다.
// mapper, service, controller별 단위 테스트를 진행하는것을 권장한다.

@SpringBootTest
class DbckdApplicationTests {

	@Autowired
	private MainMapper mapper;
	
	@Test
	void contextLoads() {
		// mapper.[method...]
	}

}
