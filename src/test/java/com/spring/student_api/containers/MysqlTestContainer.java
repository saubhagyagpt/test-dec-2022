package com.spring.student_api.containers;

import org.testcontainers.containers.MySQLContainer;

public class MysqlTestContainer extends MySQLContainer<MysqlTestContainer> {
    public static final String IMAGE_VERSION = "mysql:8";
    public static final String DATABASE_NAME = "test_container";
    public static MySQLContainer container;
    public MysqlTestContainer(){
        super(IMAGE_VERSION);
    }
    public static MySQLContainer getInstance(){
        if(container == null){
            container = new MysqlTestContainer().withDatabaseName(DATABASE_NAME);
        }
        return container;
    }

    @Override
    public void start(){
        super.start();
        System.setProperty("DB_URL", container.getJdbcUrl());
        System.setProperty("DB_USERNAME", container.getUsername());
        System.setProperty("DB_PASSWORD", container.getPassword());
    }
    @Override
    public void stop(){

    }
}
