package com.exo.web.th;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeTH {
	@GetMapping("")
	public String welcome() {
		return "welcome.html";
	}

}
