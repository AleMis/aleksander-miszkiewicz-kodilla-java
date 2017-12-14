package com.kodilla.patterns2.adapter.company.bookclasifier;

import com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.BookStatictics;
import com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatictics {

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
