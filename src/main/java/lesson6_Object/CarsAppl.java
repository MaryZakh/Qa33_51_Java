package lesson6_Object;

public class CarsAppl {

    public static void main(String[] args) {
        Car[] cars = {
                new Truck("TruckModel1", 2021, "White", 30),
                new Truck("TruckModel2", 2000, "Pink", 38),
                new Bus("BusModel1", 2023, "Red", 22),
                new Bus("BusModel2", 2022, "Yellow", 27)
        };

        displayCars(cars);

        int n_runs = 12;
        double price = 5.5;
        double res = busProfit(n_runs, price, cars);
        System.out.println("Sum = " + res);


    }

    private static double busProfit(int n_rus, double price, Car[] cars) {
        double res = 0.;
        for (Car c : cars)
            if (c instanceof Bus) {
                Bus temp = (Bus) c;
                res += temp.getN_passenger() * price * n_rus;
            }

        return res;
    }

    private static void displayCars(Car[] cars) {
        for (Car c : cars) {
            //System.out.println(c.toString());s
            System.out.println(c);

        }
    }
}
