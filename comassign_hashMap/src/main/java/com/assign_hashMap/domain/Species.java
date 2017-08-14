package com.assign_hashMap.domain;

import java.io.Serializable;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public class Species implements Serializable {

    private long speciesId;
    private String name;
    private String sciName;
    private String gender;
    private String habitat;

    private Species(Species species) {

    }

    public Species(Builder builder) {
        this.speciesId = builder.speciesId;
        this.name = builder.name;
        this.sciName = builder.sciName;
        this.gender = builder.gender;
        this.habitat = builder.habitat;

    }

    public static class Builder {
        private long speciesId;
        private String name;
        private String sciName;
        private String gender;
        private String habitat;

        public Builder speciesId(long val) {
            this.speciesId = val;
            return this;
        }

        public Builder name(String val) {
            this.name = val;
            return this;
        }

        public Builder sciName(String val) {
            this.sciName = val;
            return this;
        }

        public Builder gender(String val) {
            this.gender = val;
            return this;
        }

        public Builder habitat(String val) {
            this.habitat = val;
            return this;
        }

        public Species create() {
            return new Species(this);
        }
    }

    public long getSpeciesId() {
        return speciesId;
    }

    public String getName() {
        return name;
    }

    public String getSciName() {
        return sciName;
    }

    public String getGender() {
        return gender;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Species species = (Species) o;

        return speciesId == species.speciesId;
    }

    @Override
    public int hashCode(){
        return (int) (speciesId ^ (speciesId >>> 12345));
    }
}