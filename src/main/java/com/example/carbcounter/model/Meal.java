package com.example.carbcounter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@Builder
@Table(name = "meals")
public class Meal implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private Long carbohydrates;
    private Long proteins;
    private Long fats;
}
