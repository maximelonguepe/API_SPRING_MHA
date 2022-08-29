package com.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "heroes", schema = "mha")
public class HeroesEntity implements Serializable{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "hero_name", nullable = true, length = 45)
    private String heroName;
    @Basic
    @Column(name = "hero_description", nullable = true, length = 500)
    private String heroDescription;
    @Basic
    @Column(name = "hero_ranking", nullable = true)
    private Integer heroRanking;
    @Basic
    @Column(name = "hero_quirk", nullable = true, length = 45)
    private String heroQuirk;

    @ManyToOne
    @JoinColumn(name = "id_agency", referencedColumnName = "id", nullable = false)
    @JsonIgnoreProperties("heroes")
    private AgenciesEntity agency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroesEntity heroes = (HeroesEntity) o;
        return id == heroes.id && Objects.equals(heroName, heroes.heroName) && Objects.equals(heroDescription, heroes.heroDescription) && Objects.equals(heroRanking, heroes.heroRanking) && Objects.equals(heroQuirk, heroes.heroQuirk) && Objects.equals(agency, heroes.agency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, heroName, heroDescription, heroRanking, heroQuirk, agency);
    }
}
