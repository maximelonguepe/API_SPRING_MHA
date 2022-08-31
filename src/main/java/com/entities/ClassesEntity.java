package com.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "classes", schema = "mha")
public class ClassesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "class_name", nullable = true, length = 5)
    private String className;

    @ManyToOne
    @JoinColumn(name = "id_school", referencedColumnName = "id", nullable = false)
    @JsonIgnoreProperties("classes")
    private SchoolEntity school;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassesEntity that = (ClassesEntity) o;
        return id == that.id && Objects.equals(className, that.className) && Objects.equals(school, that.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, className, school);
    }
}
