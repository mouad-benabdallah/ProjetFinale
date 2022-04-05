package com.exo.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exo.entities.Participant;
import com.exo.service.ParticipantService;

@RestController
@RequestMapping("participant")
public class ParticipantController {
	@Autowired
	ParticipantService participantService;
	
	@GetMapping("")
	public Page<Participant> readparticipant(Pageable pageable){
		return participantService.findall(pageable);
	}
	@PostMapping
	public void addparticipant(@RequestBody @Valid Participant p) {
		participantService.addparticipent(p);
	}
	@DeleteMapping("/delete/{id}")
	public void deletebyid(@PathVariable int id) {
		participantService.deletebyid(id);
	}

}
