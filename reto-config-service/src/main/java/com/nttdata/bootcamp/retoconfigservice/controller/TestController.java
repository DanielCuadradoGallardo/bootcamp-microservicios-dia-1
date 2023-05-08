package com.nttdata.bootcamp.retoconfigservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${language.language-name}")
	private String myProduct;
	
	@GetMapping(path="/getLanguageName")
	public String myProduct() {
		return this.myProduct;
	}
}
