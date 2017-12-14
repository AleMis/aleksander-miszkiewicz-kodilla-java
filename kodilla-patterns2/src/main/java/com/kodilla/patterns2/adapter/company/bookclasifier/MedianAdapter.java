package com.kodilla.patterns2.adapter.company.bookclasifier;

import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Book> booksMap = new HashMap<>();
        for(Book book : bookSet) {
            com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Book bookB = new com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear());
            booksMap.put(new BookSignature(book.getSignature()), bookB);
        }
        return new Statistics().medianPublicationYear(booksMap);
    }
}
