package com.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "agencies", schema = "mha")
public class AgenciesEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "agency_name", nullable = false)
    private String agencyName;

    @OneToMany(mappedBy = "agency")
    @JsonIgnoreProperties("agency")
    private List<HeroesEntity> heroes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgenciesEntity that = (AgenciesEntity) o;
        return id == that.id && Objects.equals(agencyName, that.agencyName) && Objects.equals(heroes, that.heroes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agencyName, heroes);
    }
}
