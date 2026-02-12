package lesson8_HW_Employees;

public abstract class Employee {

    int id;
    String firstName = "No first name";
    String lastName = "No last name";
    int hours = -1;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int hours) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setHours(hours);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0)
            this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && isValidName(firstName))
            this.firstName = firstName;
    }

    private boolean isValidName(String firstName) {
        return firstName.matches("[A-Z][a-z]+");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && isValidName(lastName))
            this.lastName = lastName;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 250)
            this.hours = hours;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", hours=" + getHours() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;
        return getId() == employee.getId() && getHours() == employee.getHours() && getFirstName().equals(employee.getFirstName()) && getLastName().equals(employee.getLastName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getHours();
        return result;
    }

    public abstract double calcSalary();
}
