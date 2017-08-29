package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {
    public void someMethod() {
        System.out.println("It works!");
    }

	public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);

        Calculator calculator = new Calculator();
        calculator.someMethod();
    }
}