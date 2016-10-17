package com.booster;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello Spring Boot Maven";
	}

}
