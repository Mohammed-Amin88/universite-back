package fr.goffa.universite.matiere.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goffa.universite.matiere.business.IMatiereBusiness;
import fr.goffa.universite.matiere.domain.Matiere;
import fr.goffa.universite.matiere.repository.IMaitiereRepository;

@Service
public class MatiereBusinessImpl implements IMatiereBusiness {
	@Autowired
	private IMaitiereRepository maitiereRepository;

	@Override
	public List<Matiere> getMatieres() {
		List<Matiere> matiereListe = maitiereRepository.findAll();
		return matiereListe;
	}

	@Override
	public Matiere getMatiere(Integer id) {
		Matiere matiere = maitiereRepository.getOne(id);
		return matiere;
	}

	@Override
	public Matiere ajouterMatiere(Matiere matiere) {
		maitiereRepository.save(matiere);
		return maitiereRepository.save(matiere);
	}

	@Override
	public Matiere modifierMatiere(Matiere matiere) {
		maitiereRepository.save(matiere);

		return maitiereRepository.save(matiere);
	}

	@Override
	public void supMatiere(Integer id) {
		maitiereRepository.deleteById(id);
	}

}
