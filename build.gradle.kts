import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.5.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.jetbrains.kotlin.plugin.jpa") version "1.3.61" // entity 에러 제거용
    kotlin("jvm") version "1.5.21"
    kotlin("plugin.spring") version "1.5.21"
}

//noArg {
//    annotation("javax.persistence.Entity")
//    annotation("javax.persistence.MappedSuperclass")
//    annotation("javax.persistence.Embeddable")
//}
//allOpen {
//    annotation("javax.persistence.Entity")
//    annotation("javax.persistence.MappedSuperclass")
//    annotation("javax.persistence.Embeddable")
//}

group = "com.retrocellstudio"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.github.microutils:kotlin-logging:1.12.5") // Logging
    implementation("org.springframework.boot:spring-boot-starter-web") // MVC
    implementation("org.jetbrains.kotlin:kotlin-allopen") // Data : Hibernate 특징 맞추기 위해
    implementation("org.jetbrains.kotlin:kotlin-noarg") // Data : Hibernate 특징 맞추기 위해
    implementation("org.springframework.boot:spring-boot-starter-data-jpa") // Data : JPA
    implementation("org.springframework.boot:spring-boot-starter-webflux") // netty
    runtimeOnly("mysql:mysql-connector-java") // MySQL

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
