/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.tripdashboard.pets;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Pett implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Integer age;
    private String species;
    private String breed;
    private String drugs;
    private String sex;
    private Boolean sterilized;
    private String picture;
    private Organization organization;

    /* Constructors */
    public Pett() {
    }

    public Pett(Long id) {
        this.id = id;
    }

    public Pett(String name, Integer age, String species, String breed, String drugs, String sex, Boolean sterilized, String picture) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.breed = breed;
        this.drugs = drugs;
        this.sex = sex;
        this.sterilized = sterilized;
        this.picture = picture;
    }
    
    /* Getters and Setters */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getSterilized() {
        return sterilized;
    }

    public void setSterilized(Boolean sterilized) {
        this.sterilized = sterilized;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pett)) {
            return false;
        }
        Pett other = (Pett) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pt.tripdashboard.pets.Pet[ id=" + id + " ]";
    }
}
