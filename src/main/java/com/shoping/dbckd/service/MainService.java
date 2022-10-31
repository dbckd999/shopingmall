package com.shoping.dbckd.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
// import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartFile;

// 데이터베이스에서 가져온 데이터를 가공하는 곳이다.
// 이곳에선 바로 클래스를 만들지만, 팀워크를 위해 인터페이스를 만들어 설계도를 먼저 만들고 상속받은 다음 구현하는 것을 추천한다.

@Service
public class MainService {
	
	// @Autowired
	// private MainMapper mapper;

    public void saveImg(MultipartFile file) {
        try{
            file.transferTo(new File("/Users/dbckd/git/shopingmall/images/"+file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
