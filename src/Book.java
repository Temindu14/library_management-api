public class Book {

    private String title;
    private String author;
    private String publisher;
    private double price;
    private int seriesNumber;
    private int publicationYear;

    public Book(String title, String author, String publisher, double price, int seriesNumber, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.seriesNumber = seriesNumber;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    @Override
    public String toString() {
        return "Your Book Name is " + title + ", author " + author + ", price " + price;
    }
}



