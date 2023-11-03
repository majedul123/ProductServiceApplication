plugins {
	java
	id("org.springframework.boot") version "3.1.4"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation ("org.springframework.boot:spring-boot-starter-data-mongodb")
	testImplementation ("org.testcontainers:testcontainers:+")
	testImplementation ("org.testcontainers:junit-jupiter:+")
	testImplementation ("org.testcontainers:mongodb:+")



	// https://projectlombok.org
	compileOnly ("org.projectlombok:lombok:1.18.26")
	annotationProcessor ("org.projectlombok:lombok:1.18.26")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
