package com.example.spingjpa.jpa.repository;

import com.example.spingjpa.jpa.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity,Integer> {
}
