package fa.training.assignment1;

import java.util.Scanner;

public class RectangleExercise {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Width = ");
		float w = sc.nextFloat();
		System.out.print("Height = ");
		float h = sc.nextFloat();
		
		float p = (w + h) * 2;
		float a = w * h;
		System.out.println("Area is " + w + " * " + h + " = " + a);
		System.out.println("Perimeter is 2 * (" + w + " + " + h +  ")" + " = " + p);
	}

}
