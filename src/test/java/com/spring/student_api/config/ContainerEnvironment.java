package com.spring.student_api.config;


import com.spring.student_api.containers.MysqlTestContainer;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class ContainerEnvironment {
    @Container
    public static MySQLContainer mySQLContainer = MysqlTestContainer.getInstance();
}
