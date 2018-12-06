package io.github.ppSoftware.rpgSys.msAttributes.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.github.ppSoftware.rpgSys.msAttributes.exception.ResourceNotFoundException;
import io.github.ppSoftware.rpgSys.msAttributes.model.AttributeDao;
import io.github.ppSoftware.rpgSys.msAttributes.repository.AttributeDaoRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AttributeService {

	private AttributeDaoRepository attributeDaoRepository;

	public Optional<AttributeDao> findByName(String name) {

		return attributeDaoRepository.findByName(name);
	}

	public Page<AttributeDao> findAll(Pageable pageable) {
		return attributeDaoRepository.findAll(pageable);
	}

	public AttributeDao save(AttributeDao feat) {
		return attributeDaoRepository.save(feat);
	}

	public ResponseEntity<?> delete(String featName) {
		return attributeDaoRepository.findByName(featName).map(feat -> {
			attributeDaoRepository.delete(feat);
			return ResponseEntity.ok().build();
		}).orElseThrow(() -> new ResourceNotFoundException("Feat not found with id " + featName));

	}

	public AttributeDao update(@Valid AttributeDao attribute, Long attributeId) {
		return attributeDaoRepository.findById(attributeId).map(attributeDao -> {
			attributeDao.setAbbreviation(attribute.getAbbreviation());
			attributeDao.setDescription(attribute.getDescription());
			attributeDao.setName(attribute.getName());
			return attributeDaoRepository.save(attributeDao);
		}).orElseThrow(() -> new ResourceNotFoundException("Feat not found with id " + attributeId));
	}

}
