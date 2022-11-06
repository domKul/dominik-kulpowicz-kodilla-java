package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
       /* Forum theForum = new Forum();
        Map<Integer, ForumUser> usersMap= theForum.getForumUserList().stream()
                .filter(n -> n.getGender() == 'M')
                .filter(n -> n.getBirthDate().getYear() <= LocalDate.now().getYear()-20)
                .filter(n -> n.getPostsNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getId, n -> n));



        usersMap.entrySet().stream()
                .map(entry->entry.getKey()+ " " + entry.getValue())
                .forEach(System.out::println);
        System.out.println(usersMap.size());
        */

        Country c1 =new Country(new BigDecimal("123123123"));
        Continent c2 = new Continent();
        c2.addCountry(c1);
        World world = new World();
        world.addContinentToList(c2);
        world.getPeopleQuantity();

    }
}



