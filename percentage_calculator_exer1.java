package javafullcourse;

import java.util.Scanner;

public class percentage_calculator_exer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Physics marks : ");
		int Physics = sc.nextInt();
		System.out.println("Enter your English marks : ");
		int English = sc.nextInt();
		System.out.println("Enter your Chemistry marks : ");
		int Chemistry = sc.nextInt();
		System.out.println("Enter your Mathematics marks : ");
		int Mathematics = sc.nextInt();
		System.out.println("Enter your Science marks : ");
		int Science = sc.nextInt();
		
		float percentage = ((Physics + English + Chemistry + Mathematics + Science)/500.0f)*100;
		
		System.out.println("parcentage : ");
		System.out.println(percentage);
		

	}

}
