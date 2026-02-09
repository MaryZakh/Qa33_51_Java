package lesson7_HW_Market;

public class Goods {

    private String name = "No name";
    private double price = -1;
    private String company = "No company";
    private boolean isKosher;

    public Goods() {
    }

    public Goods(String name, double price, String company, boolean isKosher) {

        setName(name);
        setPrice(price);
        setCompany(company);
        this.isKosher = isKosher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank())
            this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0.)
            this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company != null && !company.isBlank())
            this.company = company;
    }

    public boolean isKosher() {
        return isKosher;
    }

    public void setKosher(boolean kosher) {
        isKosher = kosher;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", company='" + getCompany() + '\'' +
                ", isKosher=" + isKosher() +
                ", kosher=" + isKosher() +
                '}';
    }
}
