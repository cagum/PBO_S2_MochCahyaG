public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Fadli", "Book 1", 45000.0, 123);
        Books book2 = new Books("Angga", "Book2", 50000.0, 456);
        Books book3 = new Books ("Paisal", "Book3", 65000.0, 789);

        double totalPrice = book1.getPrice() + book2.getPrice() + book3.getPrice();

        System.out.println("totalPrice = Rp " + totalPrice) ;
    }
}
