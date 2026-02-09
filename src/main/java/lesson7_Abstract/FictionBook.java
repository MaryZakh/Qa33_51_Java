package lesson7_Abstract;

public class FictionBook extends LibShopBook {
    String genre = "No genre";

    public FictionBook() {
    }

    public FictionBook(String title, String author, int pages, boolean isBestseller, double pricePerPage, String genre) {
        super(title, author, pages, isBestseller, pricePerPage);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "FictionBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", pages=" + getPages() +
                ", isBestseller=" + isBestseller() +
                ", pricePerPage=" + getPricePerPage() +
                ", genre='" + getGenre() + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FictionBook)) return false;
        if (!super.equals(o)) return false;

        FictionBook that = (FictionBook) o;
        return getGenre().equals(that.getGenre());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getGenre().hashCode();
        return result;
    }


    public double calculatePrice() {
        double price = pages * pricePerPage;
        return isBestseller ? price * 2 : price;
    }
}
