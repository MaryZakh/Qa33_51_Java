package lesson14_CatsMarket;

public class Cat {
    int id;
    String name = "No name";
    int age = -1;

    public Cat() {
    }

    public Cat(int id, String name, int age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0)
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        for (int i = 0; i < name.length(); i++) {
//            if (!Character.isAlphabetic(name.charAt(i)))
//                return;
//        }
//        this.name = name;
        if (name.matches("[A-Z][a-z]*"))
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 20)
            this.age = age;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;
        return getId() == cat.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
