package fr.goffa.universite.matiere.controller;

import java.util.List;

import fr.goffa.universite.matiere.domain.Matiere;

public interface IMatiereController {

	public Matiere getMatiereById(Integer id);

	public List<Matiere> getAllMatiere();

	public Matiere ajouterMatiere(Matiere matiere);

	public Matiere modifierMatiere(Matiere m, Integer id);

	public void deleteMatiere(Integer id);

}
