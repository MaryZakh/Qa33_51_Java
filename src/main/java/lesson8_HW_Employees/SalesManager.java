package lesson8_HW_Employees;

public class SalesManager extends Employee {
    double salesValue = -1;
    double percent;

    public SalesManager() {
    }

    public SalesManager(int id, String firstName, String lastName, int hours, double salesValue, double percent) {
        super(id, firstName, lastName, hours);
       setSalesValue(salesValue);
       setPercent(percent);
        this.percent = percent;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        if (salesValue >= 0)
            this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        if (percent > 0. && percent < 100.)
            this.percent = percent;
    }


    @Override
    public String toString() {
        return "SalesManager{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", hours=" + getHours() +
                ", salesValue=" + getSalesValue() +
                ", percent=" + getPercent() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesManager)) return false;
        if (!super.equals(o)) return false;

        SalesManager that = (SalesManager) o;
        return Double.compare(getSalesValue(), that.getSalesValue()) == 0 && Double.compare(getPercent(), that.getPercent()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(getSalesValue());
        result = 31 * result + Double.hashCode(getPercent());
        return result;
    }

    @Override
    public double calcSalary() {
        return  salesValue * percent/100.;
    }
}
