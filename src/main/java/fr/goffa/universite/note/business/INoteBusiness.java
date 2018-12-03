package fr.goffa.universite.note.business;

import java.util.List;

import fr.goffa.universite.note.domain.Note;
import fr.goffa.universite.note.domain.NotePk;

public interface INoteBusiness {

	public List<Note> getNotes();

	public Note getNote(NotePk id);

	public Note modifierNote(Note note);

	public Note ajouterNote(Note note);

}
