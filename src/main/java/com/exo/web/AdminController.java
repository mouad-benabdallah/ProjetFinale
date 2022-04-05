package com.exo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exo.entities.Admin;
import com.exo.service.AccountService;

@RestController
@RequestMapping("api")
public class AdminController {
	@Autowired
	AccountService accountService;
	
	@GetMapping("")
	public List<Admin> admins(){
		return accountService.admins();
	}
	@PostMapping
	public void addadmin(@RequestBody Admin admin) {
		accountService.saveAdmin(admin);
	}

}
