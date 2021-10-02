package fa.training.assignment1;

import java.util.Scanner;

public class CircleExercise {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Radius = ");
		double radius = sc.nextFloat();
		double p = 2 * Math.PI * radius;
		double a = Math.PI * Math.pow(radius, 2);
		System.out.println("Perimeter is = " + p);
		System.out.println("Area is = " + a);
	}

}
