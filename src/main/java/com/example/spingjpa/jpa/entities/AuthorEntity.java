package com.example.spingjpa.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Builder
@AllArgsConstructor
@Table(name = "authors")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(
            name = "f_name",
            length = 35
    )
    private String firstName;

    @Column(
            name = "l_name"
    )
    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private int age;

    @Column(
            name = "created_at",
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;

    @Column(
            name = "last_modified",
            insertable = false
    )
    private LocalDateTime lastModified;

    @ManyToMany(mappedBy = "authors")
    private List<CourseEntity> courses;
}
