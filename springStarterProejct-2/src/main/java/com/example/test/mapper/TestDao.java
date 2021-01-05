package com.example.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.test.model.Member;

@Repository
@Mapper
public interface TestDao {

	int saveMember(Member member);

}
