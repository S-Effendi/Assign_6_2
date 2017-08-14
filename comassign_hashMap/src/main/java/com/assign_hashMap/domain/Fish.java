package com.assign_hashMap.domain;

import java.io.Serializable;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public class Fish implements Serializable {

    private long fishId;
    private String name;
    private String movement;
    private String movementMechanism;

    private Fish() {

    }

    public Fish(Builder builder) {
        this.fishId = builder.fishId;
        this.name = builder.name;
        this.movement = builder.movement;
        this.movementMechanism = builder.movementMechanism;

    }

    public static class Builder {
        private long fishId;
        private String name;
        private String movement;
        private String movementMechanism;

        public Builder fishId(long val) {
            this.fishId = val;
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

        public Fish create() {
            return new Fish(this);
        }
    }

    public long getFishId() {
        return fishId;
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

        Fish fish = (Fish) o;

        return fishId == fish.fishId;
    }

    @Override
    public int hashCode(){
        return (int) (fishId ^ (fishId >>> 12345));
    }

}
