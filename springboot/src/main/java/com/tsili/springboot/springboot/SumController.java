package com.tsili.springboot.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

	
	@RequestMapping(value = "/sum", method = RequestMethod.GET)
	public int sum(	@RequestParam("a") int a,
						@RequestParam("b") int b ){
			return a + b;
		
	}
	
}
