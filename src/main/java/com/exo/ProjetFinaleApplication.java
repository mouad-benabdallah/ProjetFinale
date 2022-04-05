package com.exo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exo.entities.Recommandation;
import com.exo.entities.Sortie;
import com.exo.repository.RecommandationRepository;
import com.exo.repository.SortieRepository;
//import com.exo.entities.Admin;
//import com.exo.entities.Role;
import com.exo.service.AccountService;
import com.exo.service.RecommandationService;
import com.exo.service.SortieService;

@SpringBootApplication
public class ProjetFinaleApplication implements CommandLineRunner {
	@Autowired
	AccountService api;
	@Autowired
	SortieService sortieService;
	@Autowired 
	RecommandationService recommandationService;

	public static void main(String[] args) {
		SpringApplication.run(ProjetFinaleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		api.saveAdmin(new Admin("admin1", 1, "1234", "nom1", "adresse1", "tele1", null, null));
//		api.saveAdmin(new Admin("admin2", 1, "3456", "nom2", "adresse2", "tele2", null, null));
//		api.saveRole(new Role("role1"));
//		api.saveRole(new Role("role2"));
//		api.addRoleToAdmin("admin2", "role2");
//		api.addRoleToAdmin("admin1", "role1");
//		sortieService.addsortie(new Sortie("titre1", "destination1", "depart1", "retour1", null, "description1"));
		//recommandationService.addrecommandation(new Recommandation("titre1", "texte1", "date1"));
//		
	}

}