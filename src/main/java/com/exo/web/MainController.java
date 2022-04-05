package com.exo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
	@GetMapping("")
	public String welcom() {
		return "welcom";
	}

}
