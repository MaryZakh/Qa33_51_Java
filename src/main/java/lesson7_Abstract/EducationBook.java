package lesson7_Abstract;

public class EducationBook extends LibShopBook {
    String subject = "No subject";
    double discount;

    public EducationBook() {
    }

    public EducationBook(String title, String author, int pages, boolean isBestseller, double pricePerPage, String subject, double discount) {
        super(title, author, pages, isBestseller, pricePerPage);
        this.subject = subject;
        this.discount = discount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    @Override
    public String toString() {
        return "EducationBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", pages=" + getPages() +
                ", isBestseller=" + isBestseller() +
                ", pricePerPage=" + getPricePerPage() +
                ", subject='" + getSubject() + '\'' +
                ", discount=" + getDiscount() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EducationBook)) return false;
        if (!super.equals(o)) return false;

        EducationBook that = (EducationBook) o;
        return Double.compare(getDiscount(), that.getDiscount()) == 0 && getSubject().equals(that.getSubject());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getSubject().hashCode();
        result = 31 * result + Double.hashCode(getDiscount());
        return result;
    }

    public double calculatePrice() {
        double price = pages * pricePerPage;
        return price*(1-discount/100);
    }
}
