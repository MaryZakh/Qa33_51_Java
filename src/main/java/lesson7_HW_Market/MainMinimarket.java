package lesson7_HW_Market;

public class MainMinimarket {

    public static void main(String[] args) {
        MilkFood good1 = new MilkFood("Milk diet 1L", 8.95, "Prostokvashino", false, "22.08.2023", 1000, "0.5%",
                "milk");
        MilkFood good2 = new MilkFood("Milk 1L", 6.50, "Prostokvashino", false, "20.08.2023", 1000, "2.5%", "milk");
        MilkFood good3 = new MilkFood("Milk diet 1L", 7.20, "House in the village", false, "27.08.2023", 1000, "3%",
                "milk");
        MilkFood good4 = new MilkFood("Milk 1L", 6.20, "House in the village", false, "21.08.2023", 1000, "3%", "milk");
        Food good5 = new Food("Kefir diet 1L", 11.50, "Prostokvashino", false, "15.08.2023", 1000);
        Food good6 = new Food("Kefir diet 1L", 12.20, "House in the village", false, "17.08.2023", 1000);
        Food good7 = new Food("Kefir 2.5% 1L", 10.50, "Prostokvashino", false, "10.08.2023", 1000);
        Food good8 = new Food("Kefir 3% 1L", 11.00, "House in the village", false, "13.08.2023", 1000);
        Goods good9 = new Goods("Strawberry yogurt 0.9L", 17.50, "Happy Milkman", false);
        Goods good10 = new Goods("Blueberry yogurt 0.9L", 17.50, "Happy Milkman", false);
        Goods good11 = new Goods("Mango yogurt 0.9L", 20.50, "Happy Milkman", false);
        Goods good12 = new Goods("Strawberry yogurt 0.9L", 15.30, "Prostokvashino", false);

        Goods[] goods = {good1, good2, good3, good4, good5, good6, good7, good8, good9, good10, good11, good12};
        displayMarket(goods);
        System.out.println("Count milk= " + countMilkFood(goods));
        System.out.println("Count only Food " + countFood(goods));

    }

    private static int countFood(Goods[] goods) {
        int count = 0;
        for (Goods g : goods) {
            if(g instanceof MilkFood)
                continue;
            if (g instanceof Food)
                count++;
        }
        return count;
    }

    private static int countMilkFood(Goods[] goods) {
        int count = 0;
        for (Goods g : goods) {
            if (g instanceof MilkFood)
                count++;
        }
            return count;
        }


    private static void displayMarket(Goods[] goods) {
        String str = "In my market: " + goods.length + " items of goods\nList of goods:\n";
        StringBuilder strB = new StringBuilder(str);
        int count = 0;
        for (Goods g : goods) {
            strB.append(++count).append(" - ").append(g).append("\n");
        }
        System.out.println(strB);
    }
}

