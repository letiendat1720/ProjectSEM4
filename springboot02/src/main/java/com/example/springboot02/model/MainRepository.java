package com.example.springboot02.model;

import com.example.springboot02.entity.Main;
import org.springframework.data.repository.CrudRepository;

public interface MainRepository extends CrudRepository<Main,Long> {
}