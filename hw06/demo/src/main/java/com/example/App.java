package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String message = "hello, maven!";

        String result = StringUtils.capitalize(message);

        System.out.println("Original: " + message);
        System.out.println("Capitalized: " + result);
    }
}
