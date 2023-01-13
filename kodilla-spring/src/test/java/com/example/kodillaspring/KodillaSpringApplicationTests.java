package com.example.kodillaspring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class KodillaSpringApplicationTests {

	@Test
	void testCircleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigReactiveWebApplicationContext("com.kodilla.spring");
		Shape shape = context.getBean(Circle.class);

		//When
		String name = shape.getShapeName();

		//Then
		Assertions.assertEquals("This is a circle.",name);

	}
	@Test
	void testTriangleLoadedIntoContainer(){
		//Given
		ApplicationContext context =
				new AnnotationConfigReactiveWebApplicationContext("com.kodilla.spring");
		Shape shape = context.getBean(Triangle.class);

		//When
		String name = shape.getShapeName();

		//Then
		Assertions.assertEquals("This is a triangle.",name);
	}
	@Test
	void contextLoads() {
	}

}
