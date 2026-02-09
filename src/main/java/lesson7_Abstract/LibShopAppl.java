package lesson7_Abstract;

public class LibShopAppl {

    public static void main(String[] args) {
        // Book book = new Book("Title","Author",10);
        LibShopBook[] books = {
                new FictionBook("Vii", "Gogol", 300, true, 0.20, "fantasy"),
                new EducationBook("C++", "Ivanov", 400, false, 0.10, "Programming", 20.),
                new ReligionBook("Sun", "Kukuyama", 500, false, 0.4, "Sun Religion", 10)
        };

        displayBooks(books);
        System.out.println("All Price: " + calcPrice(books));
    }

    private static double calcPrice(LibShopBook[] books) {
        double sum = 0;
        for (LibShopBook lb : books) {
//            if (lb instanceof ReligionBook) {
//                sum += (((ReligionBook) lb).calculatePrice());
//            } else if (lb instanceof EducationBook) {
//                sum += ((EducationBook) lb).calculatePrice();
//            } else if (lb instanceof FictionBook) {
//                sum += ((FictionBook) lb).calculatePrice();
//            }
            sum+=lb.calculatePrice();
        }
        return sum;
    }

    private static void displayBooks(LibShopBook[] books) {
        for (LibShopBook lb : books) {
            System.out.println(lb);
        }
    }
}
