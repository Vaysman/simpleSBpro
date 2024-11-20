package com.example.spdockpro.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name="positio")
    private String positio;
    @Column(name = "salary")
    private Double salary;

    public EmployeeEntity(String name, String positio, Double salary) {
        this.name = name;
        this.positio = positio;
        this.salary = salary;
    }
}
