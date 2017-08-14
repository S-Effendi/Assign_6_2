package com.assign_hashMap.domain;

import java.io.Serializable;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public class Mammal implements Serializable {

    private long mammalId;
    private String name;
    private String movement;
    private String movementMechanism;

    private Mammal() {

    }

    public Mammal(Builder builder) {
        this.mammalId = builder.mammalId;
        this.name = builder.name;
        this.movement = builder.movement;
        this.movementMechanism = builder.movementMechanism;

    }

    public static class Builder {
        private long mammalId;
        private String name;
        private String movement;
        private String movementMechanism;

        public Builder mammalId(long val) {
            this.mammalId = val;
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

        public Mammal create() {
            return new Mammal(this);
        }
    }

    public long getMammalId() {
        return mammalId;
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

        Mammal mammal = (Mammal) o;

        return mammalId == mammal.mammalId;
    }

    @Override
    public int hashCode(){
        return (int) (mammalId ^ (mammalId >>> 12345));
    }

}
