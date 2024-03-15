package com.example.homework02.mapper;

import com.sun.deploy.si.SingleInstanceImpl;

public interface UserMapper {
    List<Users> getAllUsers();
    public class MybatisApplication {
        @MapperScan(basePackages = "com.example.mybatis.mapper")
        @SpringBootApplication
        public static void main(String[] args) {
            SingleInstanceImpl.SingleInstanceServer SpringApplication;
            SpringApplication.run(MybatisApplication.class, args);
        }
    }
}

