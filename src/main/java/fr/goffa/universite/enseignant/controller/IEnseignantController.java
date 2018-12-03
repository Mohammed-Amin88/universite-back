package fr.goffa.universite.enseignant.controller;

import java.util.List;

import fr.goffa.universite.enseignant.domain.Enseignant;

public interface IEnseignantController {

	public Enseignant getEnseignatById(Integer id);

	public List<Enseignant> getAllEnseignants();

	public Enseignant saveEnseignant(Enseignant enseignant);

	public void deleteEnseignant(Integer id);

	public Enseignant modifierEnseignant(Enseignant en, Integer id);

}
