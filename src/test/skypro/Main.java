package test.skypro;

import test.skypro.Author;
import test.skypro.Book;

public class Main {

    public static void addBook (Book[] books, String nameOfBook, Author author, int yearOfPublishing) {
        for (int i=0; i<Book.getMaxCountOfBooks(); i++) {
            if (books[i] != null) continue;
            books[i] = new Book(nameOfBook, author, yearOfPublishing);
            return;
        }
        System.out.println("Некуда ставить книги!");
    }

    public static void printBooks (Book[] books) {
        for (int i=0; i<Book.getMaxCountOfBooks(); i++) {
            if (books[i] == null) continue;
            System.out.println(books[i].getAuthor() + ": " + books[i].getName() + ": " + books[i].getYearOfPublishing());
        }
    }

    public static void main(String[] args) {
        // авторы
        Author author1 = new Author("Пушкин", "Александр", "Сергеевич");
        Author author2 = new Author("Ирвинг", "Джон");

        // книги
        Book [] books = new Book[Book.getMaxCountOfBooks()];
        addBook(books, "Молитва об Оуэне Мини", author2, 1989);
        addBook(books, "Правила виноделов", author2, 1985);
        addBook(books, "Руслан и Людмила", author1, 2000);

        for (int i=0; i<Book.getCountOfBooks(); i++) {
            System.out.println("book" + (i+1) + " : " + books[i]);
        }

        books[2].setYearOfPublishing(2002);
        System.out.println("book3 (переиздание) : " + books[2]);

        System.out.println();
        addBook(books, "Руслан и Людмила", author1, 2000);
        System.out.println("book4 : " + books[2]);
        if (books[3].equals(books[2])) System.out.println("book3 и book4 одинаковые");
        else System.out.println("book3 и book4 разные");

        System.out.println();
        if (books[1].equals(books[0])) System.out.println("book1 и book2 одинаковые");
        else System.out.println("book1 и book2 разные");
        System.out.println("book1 : " + books[0]);
        System.out.println("book2 : " + books[1]);

        System.out.println();
        if (author1.equals(author2)) System.out.println("author1 и author2 одинаковые");
        else System.out.println("author1 и author2 разные");
        System.out.println("author1 : " + author1);
        System.out.println("author2 : " + author2);

        System.out.println();
        System.out.println("Все книги: ");
        printBooks(books);
    }
}