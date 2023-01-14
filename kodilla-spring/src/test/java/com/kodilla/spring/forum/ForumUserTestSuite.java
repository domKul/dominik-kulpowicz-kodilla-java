package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ForumUserTestSuite {

    @Test
    void testGetUsername(){
        //Given
        ApplicationContext context =
                new AnnotationConfigReactiveWebApplicationContext("com.kodilla.spring.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String name = forumUser.username;
        String expectedstr = "John Smith";

        //Then
        assertEquals(expectedstr,name);

    }
}
