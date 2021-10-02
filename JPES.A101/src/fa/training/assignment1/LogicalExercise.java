package fa.training.assignment1;

import java.util.Scanner;

public class LogicalExercise {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Input first integer: ");
		int first = sc.nextInt();
		System.out.print("Input second integer: ");
		int second = sc.nextInt();
		
		System.out.println(first != second ? first + " != " + second : "");
		System.out.println(first < second ? first + " < " + second : first + " > " + second);
		System.out.println(first <= second ? first + " <= " + second : first + " >= " + second);
	}

}
