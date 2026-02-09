package lesson7_Abstract;

public abstract class LibShopBook extends Book {
    boolean isBestseller;
    double pricePerPage;

    public LibShopBook() {
    }

    public LibShopBook(String title, String author, int pages, boolean isBestseller, double pricePerPage) {
        super(title, author, pages);
        this.isBestseller = isBestseller;
        this.pricePerPage = pricePerPage;
    }

    public boolean isBestseller() {
        return isBestseller;
    }

    public void setBestseller(boolean bestseller) {
        isBestseller = bestseller;
    }

    public double getPricePerPage() {
        return pricePerPage;
    }

    public void setPricePerPage(double pricePerPage) {
        this.pricePerPage = pricePerPage;
    }


    @Override
    public String toString() {
        return "LibShopBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", pages=" + getPages() +
                ", isBestseller=" + isBestseller() +
                ", pricePerPage=" + getPricePerPage() +
                ", bestseller=" + isBestseller() +
                '}';
    }

    @Override
    public  boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibShopBook)) return false;
        if (!super.equals(o)) return false;

        LibShopBook that = (LibShopBook) o;
        return isBestseller() == that.isBestseller() && Double.compare(getPricePerPage(), that.getPricePerPage()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Boolean.hashCode(isBestseller());
        result = 31 * result + Double.hashCode(getPricePerPage());
        return result;
    }

    public abstract double calculatePrice();
}
