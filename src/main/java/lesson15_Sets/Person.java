package lesson15_Sets;

public class Person {
    private int id;
    private String name;
    private int age;

public Person(){}

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;
        return getId() == person.getId() && getAge() == person.getAge() && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
    //final int prime = 31;
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getAge();
        return result;
    }
}
