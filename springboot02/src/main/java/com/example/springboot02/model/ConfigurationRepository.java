package com.example.springboot02.model;

import com.example.springboot02.entity.Configuration;
import org.springframework.data.repository.CrudRepository;

public interface ConfigurationRepository extends CrudRepository<Configuration,Long> {
}
