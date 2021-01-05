package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.Member;
import com.example.test.service.TestService;

@RestController
public class TestApiController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(path="/saveMember", method=RequestMethod.POST, produces = "application/json")
    public void saveMember(@RequestBody Member member) {
		try {
			testService.saveMember(member);
		} catch (Exception e) {
		}
    }

}
