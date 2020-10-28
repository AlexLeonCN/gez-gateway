package com.gez;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthController {
	@Value("${lalala.test}")
	String test;
	@RequestMapping("/test1")
	public String test1(){
		return test;
	}
}
