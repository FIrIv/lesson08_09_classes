package test.skypro;

import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;
    private String surname;

    public Author (String surname, String firstName, String secondName) {
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Author (String surname, String name) {
        this (surname, name, null);
    }

    public String getAuthor () {
        if (this.secondName == null) return this.surname + ", " + this.firstName;
        else return this.surname + ", " + this.firstName + " " + this.secondName;
    }
}