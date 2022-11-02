package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {


        Forum theForum = new Forum();
        Map<Integer, ForumUser> usersMap= theForum.getForumUserList().stream()
                .filter(n -> n.getGender() != 'F')
                .filter(n -> n.getBirthDate().getYear() <= (2002))
                .filter(n -> n.getPostsNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getId, n -> n));

        usersMap.entrySet().stream()
                .map(entry->entry.getKey()+ " " + entry.getValue())
                .forEach(System.out::println);
        System.out.println(usersMap.size());




    }

    }



