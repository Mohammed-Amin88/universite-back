package fr.goffa.universite.note.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.goffa.universite.note.business.INoteBusiness;
import fr.goffa.universite.note.controller.INoteCotroller;
import fr.goffa.universite.note.domain.Note;
import fr.goffa.universite.note.domain.NotePk;

@RestController
public class NoteRestControllerImpl implements INoteCotroller {

	private static final Logger log = LoggerFactory.getLogger(NoteRestControllerImpl.class);

	@Autowired
	private INoteBusiness noteBusiness;

	@Override
	@GetMapping("/notes")
	public List<Note> getAllNote() {
		List<Note> noteListe = noteBusiness.getNotes();
		return noteListe;
	}

	@Override
	@GetMapping("/notes/{idEtudiant}/{idMatiere}")
	public Note getNoteById(@PathVariable Integer idEtudiant, @PathVariable Integer idMatiere) {
		log.info("Note par IDMatiere et ID Etudiant");

		NotePk pk = new NotePk();
		pk.setIdEtudiant(idEtudiant);
		pk.setIdMatiere(idMatiere);
		return noteBusiness.getNote(pk);
	}

	@Override
	@PostMapping("/notes")
	public Note ajouterNote(@RequestBody Note note) {
		return noteBusiness.ajouterNote(note);
	}

	@Override
	@PutMapping("/notes/{idEtudiant}/{idMatiere}")
	public Note modifierNote(@RequestBody Note nT, @PathVariable Integer idEtudiant, @PathVariable Integer idMatiere) {
		NotePk pk = new NotePk();
		pk.setIdEtudiant(idEtudiant);
		pk.setIdMatiere(idMatiere);
		nT.setNotePk(pk);
		return noteBusiness.modifierNote(nT);
	}

}
