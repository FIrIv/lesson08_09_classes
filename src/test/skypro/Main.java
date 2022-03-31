package test.skypro;

import test.skypro.Author;
import test.skypro.Book;

public class Main {

    public static void main(String[] args) {
        // авторы
        Author author1 = new Author("Пушкин", "Александр", "Сергеевич");
        Author author2 = new Author("Ирвинг", "Джон");

        // книги
        Book book1 = new Book("Молитва об Оуэне Мини", author2, 1989);
        Book book2 = new Book ("Правила виноделов", author2, 1985);
        Book book3 = new Book ("Руслан и Людмила", author1, 2000);

        System.out.println("book1 : " + book1);
        System.out.println("book2 : " + book2);
        System.out.println("book3 : " + book3);

        book3.setYearOfPublishing(2002);
        System.out.println("book3 (переиздание) : " + book3);

        System.out.println();
        Book book4 = new Book ("Руслан и Людмила", author1, 2000);
        if (book4.equals(book3)) System.out.println("book3 и book4 одинаковые");
        else System.out.println("book3 и book4 разные");
        System.out.println("book3 : " + book3);
        System.out.println("book4 : " + book4);

        System.out.println();
        if (book2.equals(book1)) System.out.println("book1 и book2 одинаковые");
        else System.out.println("book1 и book2 разные");
        System.out.println("book1 : " + book1);
        System.out.println("book2 : " + book2);

        System.out.println();
        if (author1.equals(author2)) System.out.println("author1 и author2 одинаковые");
        else System.out.println("author1 и author2 разные");
        System.out.println("author1 : " + author1);
        System.out.println("author2 : " + author2);
    }
}