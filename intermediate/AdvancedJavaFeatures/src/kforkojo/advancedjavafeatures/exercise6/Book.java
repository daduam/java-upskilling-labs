package com.kforkojo.advancedjavafeatures.exercise6;

import java.util.Comparator;

public record Book(String title, String author, int publicationYear) {

    public static final Comparator<Book> BY_PUBLICATION_YEAR = Comparator.comparing(Book::publicationYear);
}
