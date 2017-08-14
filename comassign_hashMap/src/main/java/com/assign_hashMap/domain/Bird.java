package com.assign_hashMap.domain;

import java.io.Serializable;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public class Bird implements Serializable {

    private long birdId;
    private String name;
    private String movement;
    private String movementMechanism;

    private Bird() {

    }

    public Bird(Builder builder) {
        this.birdId = builder.birdId;
        this.name = builder.name;
        this.movement = builder.movement;
        this.movementMechanism = builder.movementMechanism;

    }

    public static class Builder {
        private long birdId;
        private String name;
        private String movement;
        private String movementMechanism;

        public Builder birdId(long val) {
            this.birdId = val;
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

        public Bird create() {
            return new Bird(this);
        }
    }

    public long getBirdId() {
        return birdId;
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

        Bird bird = (Bird) o;

        return birdId == bird.birdId;
    }

    @Override
    public int hashCode(){
        return (int) (birdId ^ (birdId >>> 12345));
    }

}
