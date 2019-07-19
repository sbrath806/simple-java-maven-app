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

		// Method Reference Example
		Sayable sayable = MethodReference::saySomething;
		sayable.say();

		// using predefined functional interface Runnable to refer static method
		Thread t2 = new Thread(MethodReference::ThreadStatus);
		t2.start();

		// using predefined functional interface to refer methods. we are using
		// BiFunction interface and using it's apply() method.
		BiFunction<Integer, Integer, Integer> adder = TestFI::add;
		int result = adder.apply(10, 20);
		System.out.println("Result of Addition :" + result);

		BiFunction<Integer, Integer, Integer> adder1 = TestFI::subtract;
		int result1 = adder1.apply(10, 20);
		System.out.println("Result of Substraction :" + result1);

		// create a list of strings
		List<String> names = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

		// declare the predicate type as string and use
		// lambda expression to create object
		Predicate<String> p = (s) -> s.startsWith("G");
		// Iterate through the list
		for (String st : names) {
			// call the test method
			if (p.test(st))
				System.out.println(st);
		}

		int inputX = 6;
		int inputY = 8;
		Square s = (int x, int y) -> x * y;
		int output = s.Calculate(inputX, inputY);
		System.out.println("Result = " + output);

		new Thread(() -> {
			System.out.println("This is a Test for Functional Interface Implementation.");
		}).start();
    }

    private final String getMessage() {
        return message;
    }

}
