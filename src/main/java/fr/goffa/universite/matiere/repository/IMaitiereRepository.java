package fr.goffa.universite.matiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.goffa.universite.matiere.domain.Matiere;

public interface IMaitiereRepository extends JpaRepository<Matiere, Integer> {

}
