package com.example.springboot02.model;

import com.example.springboot02.entity.Ram;
import org.springframework.data.repository.CrudRepository;

public interface RamRepository extends CrudRepository<Ram,Long> {
}