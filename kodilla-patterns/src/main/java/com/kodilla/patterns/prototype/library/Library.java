package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Library extends Prototype<Library>{
    private String name;
    private Set<Book> books = new HashSet<>();

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public Library shallowCopy()throws CloneNotSupportedException{
        return  super.clone();
    }
    public Library deepCopy() throws CloneNotSupportedException {
        Library deepCopyLibrary = super.clone();
        deepCopyLibrary.books = new HashSet<>();
        for (Book book :books){
            Book cloneBooks = new Book(book.getTitle(),book.getAuthor(),book.getPublicationDate());
            deepCopyLibrary.getBooks().add(cloneBooks);
        }
        return deepCopyLibrary;
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for (Book list : books) {
            s = s + list.toString() + "\n";
        }
        return s;
    }
}
