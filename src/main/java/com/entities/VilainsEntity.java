package com.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "vilains", schema = "mha", catalog = "")
public class VilainsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "VilainName", nullable = true, length = 45)
    private String vilainName;
    @Basic
    @Column(name = "VilainQuirk", nullable = true, length = 45)
    private String vilainQuirk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVilainName() {
        return vilainName;
    }

    public void setVilainName(String vilainName) {
        this.vilainName = vilainName;
    }

    public String getVilainQuirk() {
        return vilainQuirk;
    }

    public void setVilainQuirk(String vilainQuirk) {
        this.vilainQuirk = vilainQuirk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VilainsEntity that = (VilainsEntity) o;
        return id == that.id && Objects.equals(vilainName, that.vilainName) && Objects.equals(vilainQuirk, that.vilainQuirk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vilainName, vilainQuirk);
    }
}
