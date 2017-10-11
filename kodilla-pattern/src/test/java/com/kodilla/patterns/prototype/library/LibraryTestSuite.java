package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Book book1 = new Book("The Begining", "Dan Brown", LocalDate.of(2017, 8,12));
        Book book2 = new Book("Niewidzialny w sieci", "Kevin Mitnick", LocalDate.of(2016, 5,30));
        Book book3 = new Book("Sztuka podstępu", "Kevin Mitnick", LocalDate.of(2015, 4, 11));

        Library library = new Library("My Library no. 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //When
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("My Cloned Library");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            cloneLibrary.setName("My Deep Cloned Library");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        cloneLibrary.getBooks().remove(book1);

        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, cloneLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), cloneLibrary.getBooks());
        Assert.assertEquals(3, deepCloneLibrary.getBooks().size());
        Assert.assertNotEquals(cloneLibrary.getBooks(), deepCloneLibrary.getBooks().size());
    }
}
