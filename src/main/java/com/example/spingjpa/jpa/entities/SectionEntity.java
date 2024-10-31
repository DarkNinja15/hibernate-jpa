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
@Table(name = "section")
public class SectionEntity extends BaseEntity {

    private String name;

    @Column(name = "section_order")
    private int sectionOrder;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseEntity course;

    @OneToMany(mappedBy = "section")
    private List<LectureEntity> lectures;
}
