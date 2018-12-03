package fr.goffa.universite.matiere.business;

import java.util.List;

import fr.goffa.universite.matiere.domain.Matiere;

public interface IMatiereBusiness {

	public List<Matiere> getMatieres();

	public Matiere getMatiere(Integer id);

	public Matiere ajouterMatiere(Matiere matiere);

	public Matiere modifierMatiere(Matiere matiere);

	public void supMatiere(Integer id);

}
