package fr.goffa.universite.matiere.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.goffa.universite.matiere.business.IMatiereBusiness;
import fr.goffa.universite.matiere.controller.IMatiereController;
import fr.goffa.universite.matiere.domain.Matiere;

@RestController
public class MatiereRestControllerImpl implements IMatiereController {
	@Autowired
	private IMatiereBusiness matiereBusiness;

	@Override
	@GetMapping("/matieres/{id}")
	public Matiere getMatiereById(@PathVariable Integer id) {
		return matiereBusiness.getMatiere(id);

	}

	@Override
	@GetMapping("/matieres")
	public List<Matiere> getAllMatiere() {
		List<Matiere> liste = matiereBusiness.getMatieres();
		return liste;

	}

	@Override
	@PostMapping("/matieres")
	public Matiere ajouterMatiere(@RequestBody Matiere matiere) {
		Matiere m = matiereBusiness.ajouterMatiere(matiere);
		return m;
	}

	@Override
	@PutMapping("/matieres/{id}")
	public Matiere modifierMatiere(@RequestBody Matiere m, @PathVariable Integer id) {
		m.setId(id);
		return matiereBusiness.modifierMatiere(m);

	}

	@Override
	@DeleteMapping("/matieres/{id}")
	public void deleteMatiere(@PathVariable Integer id) {
		matiereBusiness.supMatiere(id);

	}

}
