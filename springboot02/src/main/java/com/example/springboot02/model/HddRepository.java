package com.example.springboot02.model;

import com.example.springboot02.entity.Hdd;
import org.springframework.data.repository.CrudRepository;


public interface HddRepository extends CrudRepository<Hdd,Long> {
}
