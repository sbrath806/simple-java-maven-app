package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        int i = 0;
        i++;
        System.out.println("Lamda Not Supported Here");
        System.out.println(new App().getMessage());	
    }

    private final String getMessage() {
        return message;
    }

}
