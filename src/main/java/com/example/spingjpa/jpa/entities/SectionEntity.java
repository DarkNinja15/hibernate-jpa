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
@Table(name = "section")
public class SectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;

    @Column(name = "section_order")
    private int sectionOrder;
}
