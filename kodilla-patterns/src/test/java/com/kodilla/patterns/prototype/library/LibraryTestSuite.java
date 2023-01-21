package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class LibraryTestSuite {
@Test
    void testGetBooks(){
        //Given
        Book book1 = new Book("TITLE1","ABB", LocalDate.of(2001,2,12));
        Book book2 = new Book("TITLE2","ABBB", LocalDate.of(1999,5,22));
        Book book3 = new Book("TITLE3","ABBBB", LocalDate.of(2004,1,12));
        Book book4 = new Book("TITLE4","ABBBB", LocalDate.of(2020,2,11));
    Library library = new Library("Main LIBRARY");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //When
    //Shallow copy
        Library cloneLibrary = null;
        try{
            cloneLibrary=library.shallowCopy();
            cloneLibrary.setName("Cloned Library1");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
    System.out.println(cloneLibrary);
     //Deep copy
    Library deepcopyLibrary = null;
    try{
        deepcopyLibrary=library.deepCopy();
        deepcopyLibrary.setName("Cloned Library 2");
    }catch(CloneNotSupportedException c){
        System.out.println(c);
    }
    System.out.println(deepcopyLibrary);

    library.getBooks().remove(book1);

    //Then
    System.out.println(library);
    System.out.println("Clone after removing one book " + cloneLibrary);
    System.out.println("Deep clone after removing one book " + deepcopyLibrary);
    Assertions.assertEquals(3,library.getBooks().size());
    Assertions.assertEquals(3,cloneLibrary.getBooks().size());
    Assertions.assertEquals(4,deepcopyLibrary.getBooks().size());

    }
}
