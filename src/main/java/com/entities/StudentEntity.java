package com.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "student", schema = "mha", catalog = "")
public class StudentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "heroName", nullable = true, length = 45)
    private String heroName;
    @Basic
    @Column(name = "studentName", nullable = true, length = 45)
    private String studentName;
    @Basic
    @Column(name = "studentSurname", nullable = true, length = 45)
    private String studentSurname;
    @Basic
    @Column(name = "class", nullable = true, length = 45)
    private String clazz;
    @Basic
    @Column(name = "table1col", nullable = true, length = 45)
    private String table1Col;
    @Basic
    @Column(name = "idClass", nullable = false)
    private int idClass;
    @Basic
    @Column(name = "studentQuirk", nullable = true, length = 45)
    private String studentQuirk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getTable1Col() {
        return table1Col;
    }

    public void setTable1Col(String table1Col) {
        this.table1Col = table1Col;
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public String getStudentQuirk() {
        return studentQuirk;
    }

    public void setStudentQuirk(String studentQuirk) {
        this.studentQuirk = studentQuirk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return id == that.id && idClass == that.idClass && Objects.equals(heroName, that.heroName) && Objects.equals(studentName, that.studentName) && Objects.equals(studentSurname, that.studentSurname) && Objects.equals(clazz, that.clazz) && Objects.equals(table1Col, that.table1Col) && Objects.equals(studentQuirk, that.studentQuirk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, heroName, studentName, studentSurname, clazz, table1Col, idClass, studentQuirk);
    }
}
