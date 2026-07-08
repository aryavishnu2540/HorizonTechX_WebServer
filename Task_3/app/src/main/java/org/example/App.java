package org.example;

public class App {
    public String getGreeting() {
        return "Horizon TechX - Gradle Build and CI/CD Successful!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}