package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book bookA1 = new Book("Radek Kotarski", "Hack to your brain", 2017, "XXXXX");
        Book bookA2 = new Book("Robert C. Martin" , "Clean Code", 2008, "ZZZZZ");
        Book bookA3 = new Book("Eric Freeman", "Head First", 2004, "YYYYY");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(bookA1);
        bookSet.add(bookA2);
        bookSet.add(bookA3);

        //When
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2008, median);
    }
}
