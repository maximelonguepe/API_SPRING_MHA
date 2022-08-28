package com.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "heroes", schema = "mha")
public class HeroesEntity {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroesEntity heroes = (HeroesEntity) o;
        return id == heroes.id && Objects.equals(heroName, heroes.heroName) && Objects.equals(heroDescription, heroes.heroDescription) && Objects.equals(heroRanking, heroes.heroRanking) && Objects.equals(heroQuirk, heroes.heroQuirk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, heroName, heroDescription, heroRanking, heroQuirk);
    }

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

    public String getHeroQuirk() {
        return heroQuirk;
    }

    public void setHeroQuirk(String heroQuirk) {
        this.heroQuirk = heroQuirk;
    }




}
