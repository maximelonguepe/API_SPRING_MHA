package com.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "vilains", schema = "mha", catalog = "")
public class VilainsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "Vilain_name", nullable = true, length = 45)
    private String vilainName;
    @Basic
    @Column(name = "Vilain_quirk", nullable = true, length = 45)
    private String vilainQuirk;


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
