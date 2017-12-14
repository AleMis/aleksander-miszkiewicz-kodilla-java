package com.kodilla.patterns2.adapter.company.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatictics {

    int averagePublicationYear(Map<BookSignature, Book> books);
    int medianPublicationYear(Map<BookSignature, Book> books);
}
