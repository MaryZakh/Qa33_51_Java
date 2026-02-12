package lesson8_Interfaces;

import lesson8_Interfaces.Interfaces.IBarkable;
import lesson8_Interfaces.Interfaces.IChirikable;
import lesson8_Interfaces.Interfaces.IMewable;

public class Tuki extends Animal implements IChirikable, IMewable, IBarkable {
    String name;
    String comboColor;

    public Tuki(){}

    public Tuki(String kind, String subspecies, String name, String comboColor) {
        super(kind, subspecies);
        this.name = name;
        this.comboColor = comboColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComboColor() {
        return comboColor;
    }

    public void setComboColor(String comboColor) {
        this.comboColor = comboColor;
    }


    @Override
    public String toString() {
        return "Tuki{" +
                "kind='" + getKind() + '\'' +
                ", subspecies='" + getSubspecies() + '\'' +
                ", name='" + getName() + '\'' +
                ", comboColor='" + getComboColor() + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tuki)) return false;
        if (!super.equals(o)) return false;

        Tuki tuki = (Tuki) o;
        return getName().equals(tuki.getName()) && getComboColor().equals(tuki.getComboColor());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getComboColor().hashCode();
        return result;
    }

    @Override
    public void chirik() {
        System.out.println("Tuki "+ name + " say chirik");
    }

    @Override
    public void mew() {
        System.out.println("Tuki " + name + " say mew-chirik");
    }

    @Override
    public void bark() {
        System.out.println("Tuki " + name + " say bark-chirik");
    }
}
