package com.oneworldController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value="/oneworld")
public class OneWorld {

	@GetMapping(value ="/one")
	public String get1() {
		return "oneWorld";
	}
	
}
