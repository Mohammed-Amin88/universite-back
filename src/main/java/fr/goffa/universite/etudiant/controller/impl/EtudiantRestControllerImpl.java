package fr.goffa.universite.etudiant.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.goffa.universite.etudiant.business.IEtudiantBusiness;
import fr.goffa.universite.etudiant.controller.IEtudiantController;
import fr.goffa.universite.etudiant.domain.Etudiant;

@RestController
public class EtudiantRestControllerImpl implements IEtudiantController {

	@Autowired
	private IEtudiantBusiness etudiantBusiness;

	@Override
	@GetMapping("/etudiants/{id}")
	public Etudiant getEtudiantById(@PathVariable Integer id) {

		return etudiantBusiness.getEtudiant(id);
	}

	@Override
	@GetMapping("/etudiants")
	public List<Etudiant> getAllEtudiants() {
		List<Etudiant> liste = etudiantBusiness.getEtudiants();
		return liste;
	}

	@Override
	@PostMapping("/etudiants")
	public Etudiant ajouterEtudiant(@RequestBody Etudiant etudiant) {
		Etudiant eT = etudiantBusiness.ajouterEtudiant(etudiant);
		return eT;

	}

	@Override
	@PutMapping("/etudiants/{id}")
	public Etudiant modifierEtudiant(@RequestBody Etudiant eT, @PathVariable Integer id) {
		eT.setId(id);
		return etudiantBusiness.ajouterEtudiant(eT);
	}

	@Override
	@DeleteMapping("/etudiants/{id}")
	public void deleteEtudiant(@PathVariable Integer id) {
		etudiantBusiness.supEtudiant(id);

	}

}
