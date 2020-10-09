package com.example.springboot02.model;

import com.example.springboot02.entity.Ssd;
import org.springframework.data.repository.CrudRepository;

public interface SsdRepository extends CrudRepository<Ssd,Long> {
}
