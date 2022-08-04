package com.shoping.dbckd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

// 데이터베이스에서 가져올 기능을 정의하는 곳이다. 쿼리문을 여기서 작성하는 방법도 있지만 따로 소개하지는 않겠다.(귀찮
// src/main/resources/mapper/mapper.xml에서 쿼리문을 작성한다.
// mapper를 여러개 만들어 운용하고 싶다면 src/main/resources/mapper 에 xml파일을 만들어 작성하면 자동으로 검색된다.

@Mapper
public interface MainMapper {
    List<Integer> getMember();

//    List<Integer> getMemberList();

//    int createMember();

//    int updateMember();

//    int deleteMember();
}
