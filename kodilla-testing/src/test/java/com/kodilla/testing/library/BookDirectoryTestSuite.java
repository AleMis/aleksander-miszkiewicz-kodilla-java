package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {


    //test sprawdzi czy lista książek spełniających warunek wyszukiwania jest poprawnie zwracana
    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());

    }


    //test posłuży do sprawdzenia czy metoda listBooksWithCondition(String titleFragment) zachowuje się poprawnie gdy
    // ilość tytułów pasujących do wzorca jest większa niż 20 - w tej sytuacji zwracana powinna być pusta lista.
    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        //mock ma zwrócić listę 15 książek w sytuacji gdy jako parametr podany zostanie dowolny tekst - mówi o tym metoda anyString()
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);

        //mock ma zwrócić pustą listę książek, gdy jako parametr (wzorzec wyszukiwania) zostanie podany tekst “ZeroBooks”.
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);

        //mock ma zwrócić listę 40 książek, gdy jako kryterium wyszukiwania (parametr metody listBooksWithCondition(String titleFragment))
        // zostanie podany tekst “FourtyBooks”.
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks")).thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    //test z kolei ma za zadanie sprawdzenie czy zwracana lista książek jest pusta, w sytuacji gdy wyszukiwany fragment
    // tytułu jest krótszy niż trzy znaki.

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBookInHandsOff() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> borrowedBooks0 = new ArrayList<Book>();
        List<Book> borrowedBooks1 = generateListOfNBooks(1);
        List<Book> borrowedBooks5 = generateListOfNBooks(5);

        LibraryUser libraryUser0 = new LibraryUser("User0", "User0", "987654321");
        LibraryUser libraryUser1 = new LibraryUser("User1", "User1", "123456789");
        LibraryUser libraryUser5 = new LibraryUser("User5", "User5", "123459876");

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser0)).thenReturn(borrowedBooks0);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(borrowedBooks1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser5)).thenReturn(borrowedBooks5);

        //When

        List<Book> theListOfBorrowedBooks0 = bookLibrary.listBooksInHandsOff(libraryUser0);
        List<Book> theListOfBorrowedBooks1 = bookLibrary.listBooksInHandsOff(libraryUser1);
        List<Book> theListOfBorrowedBooks5 = bookLibrary.listBooksInHandsOff(libraryUser5);

        //Then
        Assert.assertEquals(0, theListOfBorrowedBooks0.size());
        Assert.assertEquals(1, theListOfBorrowedBooks1.size());
        Assert.assertEquals(5, theListOfBorrowedBooks5.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

}
