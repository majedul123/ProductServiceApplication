package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@SpringBootTest
@Testcontainers
class DemoApplicationTests {

	@Container
	public static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:latest").withExposedPorts(27017);

	static void setProperties(){

	}
	@Test
	void contextLoads() {
	}

}
