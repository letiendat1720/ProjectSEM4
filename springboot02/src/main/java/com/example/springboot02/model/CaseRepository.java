package com.example.springboot02.model;

import com.example.springboot02.entity.Case;
import org.springframework.data.repository.CrudRepository;

public interface CaseRepository extends CrudRepository<Case,Long> {
}
