package com.example.spingjpa.jpa.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@Entity
@SuperBuilder
@AllArgsConstructor
@Table(name = "courses")
public class CourseEntity extends BaseEntity {

    private String name;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "authors_courses",
            joinColumns = {
                    @JoinColumn(name = "course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private List<AuthorEntity> authors;

    @OneToMany( mappedBy = "course" )
    private List<SectionEntity> sections;
}
