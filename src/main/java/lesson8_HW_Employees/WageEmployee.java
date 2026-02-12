package lesson8_HW_Employees;

public class WageEmployee extends Employee {
    double wage;

    public WageEmployee() {
    }

    public WageEmployee(int id, String firstName, String lastName, int hours, double wage) {
        super(id, firstName, lastName, hours);
        setWage(wage);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage > 35.5)
            this.wage = wage;
    }


    @Override
    public String toString() {
        return "WageEmployee{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", hours=" + getHours() +
                ", wage=" + getWage() +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WageEmployee)) return false;
        if (!super.equals(o)) return false;

        WageEmployee that = (WageEmployee) o;
        return Double.compare(getWage(), that.getWage()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(getWage());
        return result;
    }

    @Override
    public double calcSalary() {
        return hours * wage;
    }
}
