package fr.goffa.universite.note.controller;

import java.util.List;

import fr.goffa.universite.note.domain.Note;

public interface INoteCotroller {

	public List<Note> getAllNote();

	public Note getNoteById(Integer idEtudiant, Integer idMatiere);

	public Note ajouterNote(Note note);

	public Note modifierNote(Note nT, Integer idEtudiant, Integer idMatiere);

}
