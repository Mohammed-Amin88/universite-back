package fr.goffa.universite.etudiant.business;

import java.util.List;

import fr.goffa.universite.etudiant.domain.Etudiant;

public interface IEtudiantBusiness {

	public List<Etudiant> getEtudiants();

	public Etudiant getEtudiant(Integer id);

	public Etudiant ajouterEtudiant(Etudiant etudiant);

	public Etudiant modifierEtudiant(Etudiant etudiant);

	public void supEtudiant(Integer id);

}
