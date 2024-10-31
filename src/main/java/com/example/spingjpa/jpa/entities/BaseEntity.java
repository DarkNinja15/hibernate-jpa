package com.example.spingjpa.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(
            name = "created_at",
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;

    @Column(
            name = "last_modified_at",
            insertable = false
    )
    private LocalDateTime lastModifiedAt;

    @Column(
            name = "created_by",
            updatable = false,
            nullable = false
    )
    private String createdBy;

    @Column(
            name = "last_modified_by",
            insertable = false
    )
    private String lastModifiedBy;
}
