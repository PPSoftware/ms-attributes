package io.github.ppSoftware.rpgSys.msAttributes.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "attributes")
public class AttributeDao extends AuditModel {

	private static final long serialVersionUID = -8689188165800741618L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ATTRIBUTES_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "ATTRIBUTES_SEQUENCE_GENERATOR", sequenceName = "SQ_ATTRIBUTES")
	private BigInteger id;
	private String name;
	private String abbreviation;
	private String description;

}
