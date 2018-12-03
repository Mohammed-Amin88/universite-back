package fr.goffa.universite.note.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goffa.universite.note.business.INoteBusiness;
import fr.goffa.universite.note.domain.Note;
import fr.goffa.universite.note.domain.NotePk;
import fr.goffa.universite.note.repository.INoteRepository;

@Service
public class NoteBusinessImpl implements INoteBusiness {
	@Autowired
	private INoteRepository noteRepository;

	@Override
	public List<Note> getNotes() {
		List<Note> listeNote = noteRepository.findAll();
		return listeNote;
	}

	@Override
	public Note getNote(NotePk id) {
		Note note = noteRepository.getOne(id);
		return note;
	}

	@Override
	public Note ajouterNote(Note note) {
		noteRepository.save(note);
		return noteRepository.save(note);
	}

	@Override
	public Note modifierNote(Note note) {
		noteRepository.save(note);
		return noteRepository.save(note);
	}

}
