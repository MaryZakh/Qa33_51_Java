package lesson14_CatsMarket;

import java.util.ArrayList;

public class CatMarket {
    private String name;
    private String address;
    private ArrayList<Cat> cats;

    public CatMarket(String name, String address) {
        this.name = name;
        this.address = address;
        cats = new ArrayList<Cat>();
    }

    public ArrayList<Cat> getCats() {
        return new ArrayList<>(cats);
    }

    public void setCats(ArrayList<Cat> cats) {
        this.cats = cats;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addCat(Cat cat) {
        if (cat == null || cats.contains(cat))
            return false;
        return cats.add(cat);
    }

    public boolean removeCat(int id) {
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getId() == id) {
                cats.remove(i);
                return true;
            }
        }
        return false;

    }

    public void display() {
       // String str = "Market name: " + name + "\nMarket address: " + address + "\n=====================\n";
        StringBuilder str = new StringBuilder("Market name: " + name + "\nMarket address: " + address + "\n=====================\n");
        for (Cat cat : cats) {
            //str += cat.toString() + "\n";
            str.append(cat.toString() + "\n");
        }
        //str += "\n========================\n";
        str.append("\n=======================\n");
        System.out.println(str);
    }
}
