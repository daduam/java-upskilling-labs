package com.kforkojo.advancedjavafeatures.exercise6;

import java.util.ArrayList;
import java.util.List;

public class Exercise6 {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Don Quixote", "Miguel de Cervantes", 1605));
        books.add(new Book("Frankenstein", "Mary Shelley", 1818));
        books.add(new Book("The Count of Monte Cristo", "Alexandre Dumas", 1844));
        books.add(new Book("Les Misérables", "Victor Hugo", 1862));
        books.add(new Book("The Adventures of Huckleberry Finn", "Mark Twain", 1884));

        System.out.println("-- All books");
        books.forEach(System.out::println);

        System.out.println("\n-- Books sorted by ascending publication year");
        books.stream()
                .sorted(Book.BY_PUBLICATION_YEAR)
                .forEach(System.out::println);

        System.out.println("\n-- Names of sorted books published after 1844");
        books.stream()
                .sorted(Book.BY_PUBLICATION_YEAR)
                .filter(book -> book.publicationYear() > 1844)
                .map(Book::title)
                .forEach(System.out::println);
    }
}
