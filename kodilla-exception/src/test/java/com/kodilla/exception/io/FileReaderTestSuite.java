package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class FileReaderTestSuite {

    @Test
    void testReadFile(){
        //Given
        FileReader fileReader = new FileReader();
        //When & Then
        assertDoesNotThrow(()->fileReader.readFile("names.txt"));

    }
    @Test
    void whenFileDosentExistsReadFileShouldThrowException(){
        //Given
        FileReader fileReader = new FileReader();
        String fileName = "Nie istniejacy plik";
        //When & Then
        assertThrows(FileReaderException.class, ()->fileReader.readFile(fileName));
    }

    @Test
    void testReadFileWithName(){
        //Given
        FileReader fileReader = new FileReader();
        //When & Then
        assertAll(
                ()->assertThrows(FileReaderException.class, ()->fileReader.readFile("Nie istniejacy plik")),
                ()-> assertThrows(FileReaderException.class, ()->fileReader.readFile(null)),
                ()-> assertDoesNotThrow(()->fileReader.readFile("names.txt"))

        );

    }
}
