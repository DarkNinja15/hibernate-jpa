package com.example.spingjpa.jpa.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@Entity
@SuperBuilder
@AllArgsConstructor
@Table(name = "lecture")
public class LectureEntity extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private SectionEntity section;

    @OneToOne
    @JoinColumn(name = "resource_id")
    private ResourceEntity resource;
}
