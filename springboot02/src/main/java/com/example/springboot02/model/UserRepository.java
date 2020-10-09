package com.example.springboot02.model;

import com.example.springboot02.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
