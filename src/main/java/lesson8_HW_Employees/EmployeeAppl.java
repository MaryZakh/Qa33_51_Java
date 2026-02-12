package lesson8_HW_Employees;

public class EmployeeAppl {

    public static void main(String[] args) {
        Employee[] employees = {
                new SalesManager(123456789, "John", "Doe", 160, 50000, 10),
                new WageEmployee(234567890, "Jane", "Doe", 160, 20),
                new Manager(321654987, "Alice", "Cooper", 170, 5000, 2),
                new SalesManager(456987123, "James", "Bond", 178, 7000, 15),
                new WageEmployee(564987321, "Ray", "Davis", 160, 22),
                new Manager(956321478, "Kim", "Deal", 180, 8000, 5)
        };

        double res = calculateProfit(employees);
        System.out.println("Profit: " + res);

        res = calculateSalary(employees);
        System.out.println("Salary: " + res);

    }

    private static double calculateSalary(Employee[] employees) {
        double res = 0.;
        for (Employee emp : employees) {
            res += emp.calcSalary();

        }
        return res;
    }

    private static double calculateProfit(Employee[] employees) {
        double res = 0;
        for (Employee emp : employees) {
            if (emp instanceof SalesManager)
                res += ((SalesManager) emp).getSalesValue();
        }
        return res;
    }


}
