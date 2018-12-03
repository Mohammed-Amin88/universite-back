package fr.goffa.universite.etudiant.controller;

import java.util.List;

import fr.goffa.universite.etudiant.domain.Etudiant;

public interface IEtudiantController {

	public Etudiant getEtudiantById(Integer id);

	public List<Etudiant> getAllEtudiants();

	public Etudiant ajouterEtudiant(Etudiant etudiant);

	public Etudiant modifierEtudiant(Etudiant en, Integer id);

	public void deleteEtudiant(Integer id);

}
