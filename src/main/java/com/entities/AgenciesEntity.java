package com.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "agencies", schema = "mha")
public class AgenciesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    private String agencyName;

    public AgenciesEntity(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgenciesEntity that = (AgenciesEntity) o;
        return id == that.id && Objects.equals(agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agencyName);
    }
}
