package fr.goffa.universite.note.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import fr.goffa.universite.etudiant.domain.Etudiant;
import fr.goffa.universite.matiere.domain.Matiere;

@Entity(name = "T_NOTE")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@JsonInclude(Include.NON_NULL)
public class Note {
	@EmbeddedId
	private NotePk notePk;

	@Column(name = "NOTE")
	private Double note;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_etudiant", insertable = false, updatable = false)
	private Etudiant etudiant;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_matiere", insertable = false, updatable = false)
	private Matiere matiere;

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public NotePk getNotePk() {
		return notePk;
	}

	public void setNotePk(NotePk notePk) {
		this.notePk = notePk;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

}
