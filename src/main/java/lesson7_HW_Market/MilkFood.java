package lesson7_HW_Market;

public class MilkFood extends Food {
    private String milkType;
    private String productType;

    public MilkFood() {
    }

    public MilkFood(String name, double price, String company, boolean isKosher, String expDate, double weight, String milkType, String productType) {
        super(name, price, company, isKosher, expDate, weight);
        setMilkType(milkType);
        setProductType(productType);
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        if (milkType != null && !milkType.isBlank())
            this.milkType = milkType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        if (productType != null && !productType.isBlank())
            this.productType = productType;
    }


    @Override
    public String toString() {
        return "MilkFood{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", company='" + getCompany() + '\'' +
                ", kosher=" + isKosher() +
                ", expDate='" + getExpDate() + '\'' +
                ", weight=" + getWeight() +
                ", milkType='" + getMilkType() + '\'' +
                ", productType='" + getProductType() + '\'' +

                '}';
    }
}
