package com.example.springboot02.model;

import com.example.springboot02.entity.Vga;
import org.springframework.data.repository.CrudRepository;

public interface VgaRepository extends CrudRepository<Vga,Long> {
}
