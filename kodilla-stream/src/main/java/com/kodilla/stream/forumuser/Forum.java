package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public  final class Forum {
    private final List<ForumUser>forumUserList= new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1,"Marcin",'M',7,
                LocalDate.of(1994,10, 10)));
        forumUserList.add(new ForumUser(2,"Maciej",'M',0,
                LocalDate.of(2000,12,22)));
        forumUserList.add(new ForumUser(3,"Magda",'F',3,
                LocalDate.of(2002,1,17)));
        forumUserList.add(new ForumUser(4,"Martyna",'F',0,
                LocalDate.of(2010,11,24)));
        forumUserList.add(new ForumUser(5,"Ania",'F',13,
                LocalDate.of(2004,9,11)));
        forumUserList.add(new ForumUser(6,"Daniel",'M',9,
                LocalDate.of(1993,1,3)));
        forumUserList.add(new ForumUser(7,"Dominik",'M',3,
                LocalDate.of(1998,3,19)));
        forumUserList.add(new ForumUser(8,"Agnieszka",'F',1,
                LocalDate.of(1999,6,11)));
        forumUserList.add(new ForumUser(9,"Sebastian",'M',5,
                LocalDate.of(2003,4,22)));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
