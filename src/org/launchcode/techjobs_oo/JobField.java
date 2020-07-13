package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

    public int id;
    public static int nextId = 1;
    public String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int hashCode() {
        return Objects.hash(getId());
    }

    public String toString() {
        return value;
    }
}
