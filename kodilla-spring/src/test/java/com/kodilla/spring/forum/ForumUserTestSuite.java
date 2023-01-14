package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes= ForumUser.class)
public class ForumUserTestSuite {

    @Test
    void testGetUsername(){
        //Given
        ApplicationContext context =
                new AnnotationConfigReactiveWebApplicationContext("com.kodilla.spring.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String name = forumUser.username;


        //Then
        assertEquals("John Smith",name);


    }
}
