package com.example.spingjpa.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Builder
@AllArgsConstructor
@Table(name = "lecture")
public class LectureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private SectionEntity section;

    @OneToOne
    @JoinColumn(name = "resource_id")
    private ResourceEntity resource;
}
