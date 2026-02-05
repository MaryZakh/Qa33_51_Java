package lesson6_Object;

import java.util.Objects;

public class Bus extends Car {
    int n_passenger;

    public Bus() {
    }

    public Bus(String model, int year, String color, int n_passenger) {
        super(model, year, color);
        this.n_passenger = n_passenger;
    }

    public int getN_passenger() {
        return n_passenger;
    }

    public void setN_passenger(int n_passenger) {
        if (n_passenger > 0)
            this.n_passenger = n_passenger;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "n_passenger=" + n_passenger +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!super.equals(o))
            return false;
        if (!(o instanceof Bus))
            return false;
        Bus bus = (Bus) o;
        return getN_passenger() == bus.getN_passenger();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getN_passenger());
    }
}
