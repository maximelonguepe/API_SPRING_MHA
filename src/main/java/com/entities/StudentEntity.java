package com.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "student", schema = "mha")
public class StudentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "hero_name", nullable = true, length = 45)
    private String heroName;
    @Basic
    @Column(name = "student_name", nullable = true, length = 45)
    private String studentName;
    @Basic
    @Column(name = "student_surname", nullable = true, length = 45)
    private String studentSurname;

    @Basic
    @Column(name = "id_class", nullable = false)
    private int idClass;
    @Basic
    @Column(name = "student_quirk", nullable = true, length = 45)
    private String studentQuirk;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return id == that.id && idClass == that.idClass && Objects.equals(heroName, that.heroName) && Objects.equals(studentName, that.studentName) && Objects.equals(studentSurname, that.studentSurname) && Objects.equals(studentQuirk, that.studentQuirk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, heroName, studentName, studentSurname, idClass, studentQuirk);
    }
}
