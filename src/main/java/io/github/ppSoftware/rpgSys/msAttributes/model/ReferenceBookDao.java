package io.github.ppSoftware.rpgSys.msAttributes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "references_books")
public class ReferenceBookDao extends AuditModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7968414143001163842L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REFERENCES_BOOKS_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "REFERENCES_BOOKS_SEQUENCE_GENERATOR", sequenceName = "SQ_REFERENCES_BOOKS")
	@Column(name = "id")
	private Long id;

	@Column(name = "book")
	private String book;
	
	@Column(name = "abbreviation")
	private String abbreviation;
	

}
