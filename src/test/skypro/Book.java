package test.skypro;

import test.skypro.Main;
import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private Author author;
    private int yearOfPublishing;

    public Book (String name, Author author, int year) {
        java.util.Random random = new java.util.Random();
        this.id = random.nextInt();
        this.name= name;
        this.author = author;
        this.yearOfPublishing = year;
    }

    public int getId () {
        return this.id;
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

    @Override
    public String toString () {
        return this.getName() + "; " + this.getAuthor() + "; " + this.getYearOfPublishing() + " г. ";
    }

    @Override
    public boolean equals (Object book2) {
        if (this.getClass() != book2.getClass()) return false;
        Book temp = (Book) book2;
        return (name == temp.name && author.equals(temp.author)); // если сравнивать по названию и автору
        //return id == temp.id; // если сравнивать по id
    }

    @Override
    public int hashCode () {
        return Objects.hash(id);
    }
}