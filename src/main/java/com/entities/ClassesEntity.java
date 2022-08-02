package com.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "classes", schema = "mha", catalog = "")
public class ClassesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "className", nullable = true, length = 5)
    private String className;
    @Basic
    @Column(name = "idSchool", nullable = false)
    private int idSchool;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getIdSchool() {
        return idSchool;
    }

    public void setIdSchool(int idSchool) {
        this.idSchool = idSchool;
    }

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
