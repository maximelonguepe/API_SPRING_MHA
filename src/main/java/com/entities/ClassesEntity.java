package com.entities;

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
    @Basic
    @Column(name = "id_school", nullable = false)
    private int idSchool;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassesEntity that = (ClassesEntity) o;
        return id == that.id && idSchool == that.idSchool && Objects.equals(className, that.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, className, idSchool);
    }
}
