package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        // New Date time package
		LocalDate currentLocalDate = LocalDate.now();
		System.out.println("currentLocalDate - yyyy-MM-dd - " + currentLocalDate);

		// stream is an iterator whose role is to accept a set of actions to apply on
		// each of the elements it contains.
		int sum = Arrays.stream(new int[] { 1, 2, 3, 4 }).filter(i -> i > 2).map(i -> i * 3).sum();
		System.out.println("Result of Stream :" + sum);

		// Optional Class
		int min = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).min().orElse(0);

		// DoubleFunction
		DoubleFunction<Integer> bf1 = a -> (int) (a * 11);
		System.out.println("Result of DoubleFunction :" + bf1.apply(3.2));		
    }

    private final String getMessage() {
        return message;
    }

}
