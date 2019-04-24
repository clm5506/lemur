package com.cristina.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lemur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean likesToMoveIt;

    private Integer age;

    private Double weight;

    private String species;

    public Lemur(Long id, Boolean likesToMoveIt, Integer age, Double weight, String species) {
        this.id = id;
        this.likesToMoveIt = likesToMoveIt;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public Lemur( Boolean likesToMoveIt, Integer age, Double weight, String species) {
        this.likesToMoveIt = likesToMoveIt;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public Lemur(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getLikesToMoveIt() {
        return likesToMoveIt;
    }

    public void setLikesToMoveIt(Boolean likesToMoveIt) {
        this.likesToMoveIt = likesToMoveIt;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    @Override
    public String toString() {
        return "Lemur{" +
                "id=" + id +
                ", likesToMoveIt=" + likesToMoveIt +
                ", age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}
