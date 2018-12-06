package io.github.ppSoftware.rpgSys.msAttributes.web;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ppSoftware.rpgSys.msAttributes.model.AttributeDao;
import io.github.ppSoftware.rpgSys.msAttributes.service.AttributeService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/attributes")
@AllArgsConstructor
public class AttributeController {

    private AttributeService attributeService;

    @GetMapping("/{attribute}")
    Optional<AttributeDao> getFeat(@PathVariable String attribute) {
        return attributeService.findByName(attribute);
    }

    @GetMapping("/list")
    Page<AttributeDao> getFeats(Pageable pageable) {
        return attributeService.findAll(pageable);
    }

    @PostMapping("/add")
    public AttributeDao createFeat(@Valid @RequestBody AttributeDao attribute) {
	 
        return attributeService.save(attribute);
    }

    @PutMapping("/update/{attributeId}")
    public AttributeDao update(@Valid @RequestBody AttributeDao attribute, @PathVariable Long attributeId) {
	 
        return attributeService.update(attribute, attributeId);
    }
    
    @DeleteMapping("/delete/{attributeName}")
    public ResponseEntity<?> deleteAttribute(@PathVariable String attibuteName) {
	 
        return attributeService.delete(attibuteName);
    }
    
    
}
