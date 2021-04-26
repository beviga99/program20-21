package model;

/*
 * The Book class models a book with one (and only one) author.
 */
public class Book {
    // The private instance variables

    private String name;
    private Author author;
    private double price;
    private int pages;

    // Constructors
    public Book() {

    }

    public Book(String name, Author author, double price, int pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;  // return member author, which is an instance of the class Author
    }

    public double getPrice() {
        return price;
    }
    
    public String getNolakoa(int pages) {
        if (pages < 100) {
            return "Txikia";
        } else if (pages < 200) {
            return "Normala";
        } else {
            return "Handia";
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return name + ", " + author.getName() + ", " + price + ", " + pages;  
    }
}