package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int Id;
    private final String userName;
    private  char gender = 'M'/'F';
    private final LocalDate birthDate ;
    private final int postsNumber;




    public ForumUser(int id, String userName, char gender, int postsNumber, LocalDate birthDate) {
        this.Id = id;
        this.userName = userName;
        this.gender = gender;
        this.postsNumber= postsNumber;
        this.birthDate=birthDate;


    }

    public int getId() {
        return Id;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
