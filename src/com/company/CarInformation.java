package com.company;

public class CarInformation {
    private int year;
    private String model;
    private int price;
    private String color;

    public CarInformation(int year, String model, int price, String color) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CarInformation)) return false;
        final CarInformation other = (CarInformation) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getYear() != other.getYear()) return false;
        final Object this$model = this.getModel();
        final Object other$model = other.getModel();
        if (this$model == null ? other$model != null : !this$model.equals(other$model)) return false;
        if (this.getPrice() != other.getPrice()) return false;
        final Object this$color = this.getColor();
        final Object other$color = other.getColor();
        if (this$color == null ? other$color != null : !this$color.equals(other$color)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CarInformation;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getYear();
        final Object $model = this.getModel();
        result = result * PRIME + ($model == null ? 43 : $model.hashCode());
        result = result * PRIME + this.getPrice();
        final Object $color = this.getColor();
        result = result * PRIME + ($color == null ? 43 : $color.hashCode());
        return result;
    }

    public String toString() {
        return "CarInformation(year=" + this.getYear() + ", model=" + this.getModel() + ", price=" + this.getPrice() + ", color=" + this.getColor() + ")";
    }
}
