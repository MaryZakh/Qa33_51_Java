package lesson6_Object;

import java.util.Objects;

public class Car {
    String model = "No model";
    int year;
    String color = "No color";

    public Car() {
    }

    public Car(String model, int year, String color) {
//        if (model != null && !model.isBlank())
//            this.model = model;
        setModel(model);
//        else
//            this.model = "No model";
//        if (year > 1980 && year <= 2025)
//            this.year = year;
        setYear(year);
//        if (color != null && isTrueColor(color))
//            this.color = color;
        setColor(color);
    }

    private boolean isTrueColor(String color) {
        String[] colors = {"White", "Red", "Yellow", "Black", "Green", "Pink"};
        for (String c : colors) {
            if (c.equalsIgnoreCase(color))
                return true;
        }
        return false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank())
            this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1980 && year <= 2025)
            this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && isTrueColor(color))
            this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this==o)
            return true;
        if (!(o instanceof Car))
            return false;
        Car other = (Car)o;
        return Objects.equals(model, other.model) &&
                Objects.equals(color, other.color) &&
                Objects.equals(year,other.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getYear(), getColor());
    }
}



