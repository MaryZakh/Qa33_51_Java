package lesson7_HW_Market;

public class Food extends Goods {
    private String expDate = "0000/00/00";
    private double weight;


    public Food() {
    }

    public Food(String name, double price, String company, boolean isKosher, String expDate, double weight) {
        super(name, price, company, isKosher);
        setExpDate(expDate);
        setWeight(weight);
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        if (expDate != null && !expDate.isBlank() && isDate(expDate))//2026/02/09 or 09-12-2026 or 09.12.2026
            this.expDate = expDate;
    }

    private boolean isDate(String expDate) {
        //2000-2019|2020-2026
        return expDate.matches("(\\20[01]\\d|2[0-6])/(0[1-9]|1[0-2]/0[1-9]|[12]\\d|3[01])" +
                "|(\\d{2}-\\d{2}-\\d{4})" +
                "|(\\d{2}\\.\\d{2}\\.\\d{4})");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0.)
            this.weight = weight;
    }


    @Override
    public String toString() {
        return "Food{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", company='" + getCompany() + '\'' +
                ", kosher=" + isKosher() +
                ", expDate='" + getExpDate() + '\'' +
                ", weight=" + getWeight() +

                '}';
    }
}
