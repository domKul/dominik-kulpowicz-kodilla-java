package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("Test Author1","TEst title1",2000,"da12131");
        Book book2 = new Book("Test Author2","TEst title2",1990,"1231231");
        Book book3 = new Book("Test Author3","TEst title3",2005,"11111");
        Book book4 = new Book("Test Author4","TEst title4",1950,"232111");
        Book book5 = new Book("Test Author5","TEst title5",2015,"sf2322");
        Set<Book>booksList = new HashSet<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int mediana = medianAdapter.publicationYearMedian(booksList);
        //Then
        assertEquals(2000,mediana);



    }
}
