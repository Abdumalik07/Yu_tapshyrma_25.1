package com.company;

public class Car {
    private int id;
    private int autoNumber;


    public Car(int id, int autoNumber) {
        this.id = id;
        this.autoNumber = autoNumber;
    }

    public int getId() {
        return this.id;
    }

    public int getAutoNumber() {
        return this.autoNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAutoNumber(int autoNumber) {
        this.autoNumber = autoNumber;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Car)) return false;
        final Car other = (Car) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        if (this.getAutoNumber() != other.getAutoNumber()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Car;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        result = result * PRIME + this.getAutoNumber();
        return result;
    }

    public String toString() {
        return "Car(id=" + this.getId() + ", autoNumber=" + this.getAutoNumber() + ")";
    }
}
