package lesson7_Abstract;

public class ReligionBook extends LibShopBook {

    String religion = "No religion";
    double donation;

    public ReligionBook() {
    }

    public ReligionBook(String title, String author, int pages, boolean isBestseller, double pricePerPage, String religion, double donation) {
        super(title, author, pages, isBestseller, pricePerPage);
        this.religion = religion;
        this.donation = donation;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public double getDonation() {
        return donation;
    }

    public void setDonation(double donation) {
        this.donation = donation;
    }


    @Override
    public String toString() {
        return "ReligionBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", pages=" + getPages() +
                ", isBestseller=" + isBestseller() +
                ", pricePerPage=" + getPricePerPage() +
                ", religion='" + getReligion() + '\'' +
                ", donation=" + getDonation() +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReligionBook)) return false;
        if (!super.equals(o)) return false;

        ReligionBook that = (ReligionBook) o;
        return Double.compare(getDonation(), that.getDonation()) == 0 && getReligion().equals(that.getReligion());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getReligion().hashCode();
        result = 31 * result + Double.hashCode(getDonation());
        return result;
    }



    public double calculatePrice() {
        return donation;
    }
}
