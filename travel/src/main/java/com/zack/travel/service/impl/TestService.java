package com.zack.travel.service.impl;

import org.springframework.stereotype.Service;

import com.zack.travel.service.ITestService;

@Service
public class TestService implements ITestService {

	public String test() {
		System.out.println("test");
		return  "test";
	}

}
