public class Books {
    private String author;
    private String title;
    private Double price;
    private int publisherNumber;

    public Books(String author, String title, double price, int publisherNumber) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisherNumber = publisherNumber;
    }

    public String getAuthor() {
        return author;
    }
    
    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public int publisherNumber() {
        return publisherNumber;

    }
}
