package com.assign_hashMap.domain;

import java.io.Serializable;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public class Invertebrate implements Serializable {

private long invertebrateId;
private String name;
private String movement;
private String movementMechanism;

private Invertebrate() {

        }

public Invertebrate(Builder builder) {
        this.invertebrateId = builder.invertebrateId;
        this.name = builder.name;
        this.movement = builder.movement;
        this.movementMechanism = builder.movementMechanism;

        }

public static class Builder {
    private long invertebrateId;
    private String name;
    private String movement;
    private String movementMechanism;

    public Builder invertebrateId(long val) {
        this.invertebrateId = val;
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

    public Invertebrate create() {
        return new Invertebrate(this);
    }
}

    public long getInvertebrateId() {
        return invertebrateId;
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

        Invertebrate invertebrate = (Invertebrate) o;

        return invertebrateId == invertebrate.invertebrateId;
    }

    @Override
    public int hashCode(){
        return (int) (invertebrateId ^ (invertebrateId >>> 12345));
    }

}