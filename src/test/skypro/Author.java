package test.skypro;

import java.util.Objects;

public class Author {
    private int id;
    private String firstName;
    private String secondName;
    private String surname;

    public Author (String surname, String firstName, String secondName) {
        java.util.Random random = new java.util.Random();
        this.id = random.nextInt();
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Author (String surname, String name) {
        this (surname, name, null);
    }

    public int getId () {
        return this.id;
    }

    public String getAuthor () {
        if (this.secondName == null) return this.surname + ", " + this.firstName;
        else return this.surname + ", " + this.firstName + " " + this.secondName;
    }

    @Override
    public String toString () {
        return this.getAuthor();
    }

    @Override
    public boolean equals (Object author2) {
        if (this.getClass() != author2.getClass()) return false;
        Author temp = (Author) author2;
        return (firstName == temp.firstName && secondName == temp.secondName && surname == temp.surname); // если сравнивать по Ф.И.О
        //return id == temp.id; // если сравнивать по id
    }

    @Override
    public int hashCode () {
        return Objects.hash(id);
    }
}