package com.example.springboot02.model;

import com.example.springboot02.entity.Cpu;
import org.springframework.data.repository.CrudRepository;

public interface CpuRepository extends CrudRepository<Cpu,Long> {
}

