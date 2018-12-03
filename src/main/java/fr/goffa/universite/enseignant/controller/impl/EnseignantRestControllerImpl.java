package fr.goffa.universite.enseignant.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.goffa.universite.enseignant.business.IEnseignantBusiness;
import fr.goffa.universite.enseignant.controller.IEnseignantController;
import fr.goffa.universite.enseignant.domain.Enseignant;

@RestController
public class EnseignantRestControllerImpl implements IEnseignantController {
	@Autowired
	private IEnseignantBusiness enseignantBusiness;

	@Override
	@GetMapping("/enseignants/{id}")
	public Enseignant getEnseignatById(@PathVariable Integer id) {
		return enseignantBusiness.getEnseignant(id);
	}

	@Override
	@GetMapping("/enseignants")
	public List<Enseignant> getAllEnseignants() {
		List<Enseignant> liste = enseignantBusiness.getEnseignants();
		return liste;
	}

	@Override
	@PostMapping("/enseignants")
	public Enseignant saveEnseignant(@RequestBody Enseignant en) {
		Enseignant e = enseignantBusiness.saveEnseignant(en);

		return e;

	}

	@Override
	@PutMapping("/enseignants/{id}")
	public Enseignant modifierEnseignant(@RequestBody Enseignant en, Integer id) {
		en.setId(id);
		return enseignantBusiness.saveEnseignant(en);
	}

	@Override
	@DeleteMapping("/enseignants/{id}")
	public void deleteEnseignant(@PathVariable Integer id) {
		enseignantBusiness.supEnseignant(id);
	}

}
