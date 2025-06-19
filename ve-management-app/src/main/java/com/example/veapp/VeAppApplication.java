package com.example.veapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeAppApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(VeAppApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Ứng dụng Quản lý Vé đã khởi chạy.");
        }
    }
}
