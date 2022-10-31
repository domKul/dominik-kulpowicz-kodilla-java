package com.kodilla.testing.library;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {
    private LibraryDatabase libraryDatabaseMock;

    private List<Book>generateListOfNBooks(int booksQantity){
        List<Book>resultList = new ArrayList<>();
        for(int n = 1; n<=booksQantity; n++){
            Book theBook = new Book("Title " + n ," Aurhor "+ n ,1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks= bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());

    }
    @Test
    void testListBooksWithConditionFragmentShorterThan3() {

        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        //When
        List<Book>theListOfBooks10=bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    void testListBooksInHandsOf(){

        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser lUser1= new LibraryUser("firstName1", "lastName", "123456789");
        LibraryUser lUser2= new LibraryUser("firstName2", "lastName", "123456789");
        LibraryUser lUser3= new LibraryUser("firstName3", "lastName", "123456789");


        List<Book> noBooks = new ArrayList<>(0);
        List<Book>listOf5Books = generateListOfNBooks(5);
        List<Book>listOf1Books = generateListOfNBooks(1);

        when(libraryDatabaseMock.listBooksInHandsOf(lUser1))
                .thenReturn(noBooks);
        when(libraryDatabaseMock.listBooksInHandsOf(lUser2))
                .thenReturn(listOf5Books);
        when(libraryDatabaseMock.listBooksInHandsOf(lUser3))
                .thenReturn(listOf1Books);

        //When
        List<Book>userBooks1 = bookLibrary.listBooksInHandsOf(lUser1);
       List<Book>userBooks2 = bookLibrary.listBooksInHandsOf(lUser2);
       List<Book>userBooks3 = bookLibrary.listBooksInHandsOf(lUser3);

        //Then
        assertEquals(0,userBooks1.size());
        assertEquals(5,userBooks2.size());
        assertEquals(1,userBooks3.size());
    }


}
