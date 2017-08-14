package com.assign_hashMap.domain;

import java.io.Serializable;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public class Reptile implements Serializable {

    private long reptileId;
    private String name;
    private String movement;
    private String movementMechanism;

    private Reptile() {

    }

    public Reptile(Builder builder) {
        this.reptileId = builder.reptileId;
        this.name = builder.name;
        this.movement = builder.movement;
        this.movementMechanism = builder.movementMechanism;

    }

    public static class Builder {
        private long reptileId;
        private String name;
        private String movement;
        private String movementMechanism;

        public Builder reptileId(long val) {
            this.reptileId = val;
            return this;
        }

        public Builder name(String val) {
            this.name = val;
            return this;
        }

        public Builder movement(String val) {
            this.movement = val;
            return this;
        }

        public Builder movementMechanism(String val) {
            this.movementMechanism = val;
            return this;
        }

        public Reptile create() {
            return new Reptile(this);
        }
    }

    public long getReptileId() {
        return reptileId;
    }

    public String getName() {
        return name;
    }

    public String getMovement() {
        return movement;
    }

    public String getMovementMechanism() {
        return movementMechanism;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reptile reptile = (Reptile) o;

        return reptileId == reptile.reptileId;
    }

    @Override
    public int hashCode(){
        return (int) (reptileId ^ (reptileId >>> 12345));
    }

}