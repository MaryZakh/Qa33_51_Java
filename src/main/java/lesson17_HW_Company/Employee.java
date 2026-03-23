package lesson17_HW_Company;

public class Employee implements Comparable<Employee> {

    String lastName;
    String firstName;
    int id;
    double salary;


    public Employee() {
    }

    public Employee(String lastName, String firstName, int id, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;
        return getId() == employee.getId() && Double.compare(getSalary(), employee.getSalary()) == 0 && getLastName().equals(employee.getLastName()) && getFirstName().equals(employee.getFirstName());
    }

    @Override
    public int hashCode() {
        int result = getLastName().hashCode();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getId();
        result = 31 * result + Double.hashCode(getSalary());
        return result;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + getLastName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", id=" + getId() +
                ", salary=" + getSalary() +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int res = lastName.compareTo(o.lastName);
        if (res != 0) return res;
        res = firstName.compareTo(o.firstName);
        if (res != 0) return res;
        res = Double.compare(salary, o.salary);
        return res != 0 ? res : id - o.id;
    }
}
