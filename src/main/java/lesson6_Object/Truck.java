package lesson6_Object;

import java.util.Objects;

public class Truck extends Car {
    int load_capacity;

    public Truck(){}

    public Truck(String model, int year, String color, int load_capacity) {
        super(model, year, color);
        setLoad_capacity(load_capacity);
    }

    public int getLoad_capacity() {
        return load_capacity;
    }

    public void setLoad_capacity(int load_capacity) {
        if(load_capacity>1 && load_capacity <100)
        this.load_capacity = load_capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "load_capacity=" + load_capacity +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Truck))
            return false;
        if (!super.equals(o))
            return false;
        Truck truck = (Truck) o;
        return getLoad_capacity() == truck.getLoad_capacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLoad_capacity());
    }
}
