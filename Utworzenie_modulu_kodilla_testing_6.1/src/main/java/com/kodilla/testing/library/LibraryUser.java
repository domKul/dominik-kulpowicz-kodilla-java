package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    String firstName;
    String lastName;
    String peseId;

    public LibraryUser(String firstName, String lastName, String peseId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peseId = peseId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPeseId() {
        return peseId;
    }

    public void setPeseId(String peseId) {
        this.peseId = peseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(peseId, that.peseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, peseId);
    }
}
