package lesson8_Interfaces;

import lesson8_Interfaces.Interfaces.IBarkable;

public class Dog extends Animal implements IBarkable {
    String nick_name;

    public Dog(){}

    public Dog(String kind, String subspecies, String nick_name) {
        super(kind, subspecies);
        this.nick_name = nick_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "kind='" + getKind() + '\'' +
                ", subspecies='" + getSubspecies() + '\'' +
                ", nick_name='" + getNick_name() + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;
        return getNick_name().equals(dog.getNick_name());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getNick_name().hashCode();
        return result;
    }

    @Override
    public void bark() {
        System.out.println("Dog "+ nick_name + " say bark");
    }
}
