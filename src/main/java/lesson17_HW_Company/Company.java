package lesson17_HW_Company;

import java.util.TreeSet;

public class Company implements ICompany {
    String companyName;
    String address;
    private TreeSet<Employee> staff;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Company(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
        staff = new TreeSet<>();
    }

    public TreeSet<Employee> getStaff() {
        return new TreeSet<Employee>(staff);
    }

    public void setStaff(TreeSet<Employee> staff) {
        this.staff = staff;
    }

    @Override
    public boolean addEmployee(Employee emp) {
        if (emp == null)
            return false;
        return staff.add(emp);
    }

    @Override
    public boolean fireEmployee(int id) {
        Employee e = findEmployeeById(id);
        return e == null ? false : staff.remove(e);
    }

    @Override
    public Employee findEmployeeById(int id) {
        for (Employee emp : staff) {
            if (emp.id == id)
                return emp;
        }
        return null;
    }

    @Override
    public double totalSalary() {
        double sum = 0.;
        for (Employee emp : staff) {
            sum += emp.getSalary();
        }
        return sum;
    }

    @Override
    public double avgSalary() {
        if (staff.size() == 0) return 0.;
        return totalSalary() / staff.size();
    }

    @Override
    public void display() {
        String res = "Company name: " + companyName + "\nAddress: " + address
                + "\nEmployees: \n=========================================\n";
        int count = 1;
        for (Employee emp : staff) {
            res += count + ". " + emp + "\n";
            count++;
        }
        res += "===================================\n";
        System.out.println(res);
    }
}
