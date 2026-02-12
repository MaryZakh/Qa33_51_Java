package lesson8_Interfaces;

public abstract class Animal {
    String kind;
    String subspecies;

    public Animal(){}

    public Animal(String kind, String subspecies) {
        this.kind = kind;
        this.subspecies = subspecies;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "kind='" + getKind() + '\'' +
                ", subspecies='" + getSubspecies() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;
        return getKind().equals(animal.getKind()) && getSubspecies().equals(animal.getSubspecies());
    }

    @Override
    public int hashCode() {
        int result = getKind().hashCode();
        result = 31 * result + getSubspecies().hashCode();
        return result;
    }
}
