package test.skypro;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublishing;

    public Book (String name, Author author, int year) {
        this.name= name;
        this.author = author;
        this.yearOfPublishing = year;
    }

    public String getName () {
        return this.name;
    }

    public String getAuthor () {
        return this.author.getAuthor();
    }

    public int getYearOfPublishing () {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing (int year2) {
        int currentYear = LocalDate.now().getYear();
        if (year2 <= currentYear) this.yearOfPublishing = year2;
    }
}