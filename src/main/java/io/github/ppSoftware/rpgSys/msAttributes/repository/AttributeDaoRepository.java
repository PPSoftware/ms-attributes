package io.github.ppSoftware.rpgSys.msAttributes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.github.ppSoftware.rpgSys.msAttributes.model.AttributeDao;

@Repository
public interface AttributeDaoRepository extends JpaRepository<AttributeDao, Long> {

	Optional<AttributeDao> findByName(String name);
}
