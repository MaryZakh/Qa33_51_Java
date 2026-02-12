package lesson8_HW_Employees;

public class Manager extends Employee {

    double baseSalary = 0;
    int grade = 0;

    public Manager() {
    }

    public Manager(int id, String firstName, String lastName, int hours, double baseSalary, int grade) {
        super(id, firstName, lastName, hours);
        setBaseSalary(baseSalary);
        setGrade(grade);
        this.grade = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 6300.)
            this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 8)
            this.grade = grade;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", hours=" + getHours() +
                ", baseSalary=" + getBaseSalary() +
                ", grade=" + getGrade() +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;
        return Double.compare(getBaseSalary(), manager.getBaseSalary()) == 0 && getGrade() == manager.getGrade();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(getBaseSalary());
        result = 31 * result + getGrade();
        return result;
    }

    @Override
    public double calcSalary() {
        return baseSalary*grade*hours;
    }
}
