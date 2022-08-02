package com.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "heroes", schema = "mha", catalog = "")
public class HeroesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "heroName", nullable = true, length = 45)
    private String heroName;
    @Basic
    @Column(name = "heroDescription", nullable = true, length = 500)
    private String heroDescription;
    @Basic
    @Column(name = "heroRanking", nullable = true)
    private Integer heroRanking;
    @Basic
    @Column(name = "idAgency", nullable = false)
    private int idAgency;
    @Basic
    @Column(name = "heroQuirk", nullable = true, length = 45)
    private String heroQuirk;

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

    public String getHeroDescription() {
        return heroDescription;
    }

    public void setHeroDescription(String heroDescription) {
        this.heroDescription = heroDescription;
    }

    public Integer getHeroRanking() {
        return heroRanking;
    }

    public void setHeroRanking(Integer heroRanking) {
        this.heroRanking = heroRanking;
    }

    public int getIdAgency() {
        return idAgency;
    }

    public void setIdAgency(int idAgency) {
        this.idAgency = idAgency;
    }

    public String getHeroQuirk() {
        return heroQuirk;
    }

    public void setHeroQuirk(String heroQuirk) {
        this.heroQuirk = heroQuirk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroesEntity that = (HeroesEntity) o;
        return id == that.id && idAgency == that.idAgency && Objects.equals(heroName, that.heroName) && Objects.equals(heroDescription, that.heroDescription) && Objects.equals(heroRanking, that.heroRanking) && Objects.equals(heroQuirk, that.heroQuirk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, heroName, heroDescription, heroRanking, idAgency, heroQuirk);
    }
}
