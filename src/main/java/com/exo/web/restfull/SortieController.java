package com.exo.web.restfull;



import java.util.List;

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

import com.exo.entities.Sortie;
import com.exo.service.SortieService;

@RestController
@RequestMapping("api/sortie")
public class SortieController {
	@Autowired
	SortieService sortieService;
	
	@GetMapping("")
	public Page<Sortie> read(Pageable pageable){
		return sortieService.readall(pageable);
	}
	@PostMapping
	public void addSortie(@RequestBody @Valid Sortie sortie) {
		sortieService.addsortie(sortie);
	}
	@DeleteMapping("/delete/{id}")
	public void deletbyid(@PathVariable int id) {
		sortieService.deletebyid(id);
	}
	@GetMapping("/titre/{titre}")
	public Sortie findbytitre(@PathVariable String titre) {
		return sortieService.findByTitre(titre);
	}
	@GetMapping("/destination/{destination}")
	public Sortie findbydestination(@PathVariable String destination) {
		return sortieService.findByDestination(destination);
	}
	@GetMapping("/depart/{depart}")
	public List<Sortie> findbydepart(@PathVariable String depart) {
		return sortieService.findByDepart(depart);
	}
	@GetMapping("/retour/{retour}")
	public List<Sortie> findbyretour(@PathVariable String retour) {
		return sortieService.findByRetour(retour);
	}
	@GetMapping("/admin/{admin}")
	public Sortie findbyadmin(@PathVariable String admin) {
		return sortieService.findByAdmin(admin);
	}

}
