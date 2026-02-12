package lesson8_Interfaces;

import lesson8_Interfaces.Interfaces.IMewable;

public class Cat extends Animal implements IMewable {
    String name;
    String color;

   public Cat(){}

    public Cat(String kind, String subspecies, String name, String color) {
        super(kind, subspecies);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "kind='" + getKind() + '\'' +
                ", subspecies='" + getSubspecies() + '\'' +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;
        return getName().equals(cat.getName()) && getColor().equals(cat.getColor());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getColor().hashCode();
        return result;
    }

    @Override
    public void mew() {
        System.out.println(name + " say mew");
    }
}
