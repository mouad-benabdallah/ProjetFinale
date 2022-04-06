package com.exo.web.th;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exo.entities.Participant;
import com.exo.service.ParticipantService;

@Controller
@RequestMapping("participant")
public class ParticipantThController {
	@Autowired
	ParticipantService participantService;
	
	@GetMapping("")
	public String participants(Model m,Pageable pageable) {
		Page<Participant> list = participantService.findall(pageable);
		Participant participant = new Participant();
		m.addAttribute("participant", participant);
		m.addAttribute("participants", list);
		return "participant";
	}
	@PostMapping("/add")
	public String addparticipant(@Valid Participant participant,BindingResult result) {
		if(result.hasErrors())
		{
			return "participant";
		}
		else
		{
		participantService.addparticipent(participant);
		return "redirect:/participant";
		}
	}
	@GetMapping("/liste")
	public String listparticipant(Model m,Pageable pageable) {
		Page<Participant> list = participantService.findall(pageable);
		m.addAttribute("participants", list);
		return "listparticipant";
	}
	@RequestMapping(value = "/delete/{id}",method = {RequestMethod.GET,RequestMethod.DELETE})
	public String delete(@PathVariable int id) {
		participantService.deletebyid(id);
		return "redirect:/participant";
	}

}
