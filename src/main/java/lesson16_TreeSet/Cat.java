package lesson16_TreeSet;

public class Cat implements Comparable<Cat> {
    private int age;
    private String name;
    private String color;

    public Cat() {
    }

    public Cat(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;
        return getAge() == cat.getAge() && getName().equals(cat.getName()) && getColor().equals(cat.getColor());
    }

    @Override
    public int hashCode() {
        int result = getAge();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getColor().hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        int res = age - o.age;
        if (res != 0)
            return res;
        res = name.compareTo(o.name);
        if (res != 0)
            return res;
        return color.compareTo(o.color);
    }


}
