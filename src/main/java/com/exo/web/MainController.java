package com.exo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exo.entities.Sortie;
import com.exo.repository.SortieRepository;

@RestController

public class MainController {
	@GetMapping("")
	public String welcom() {
		return "welcom";
	}
	
}
