package com.example.spingjpa.jpa.repository;

import com.example.spingjpa.jpa.entities.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<VideoEntity,Integer> {
}
