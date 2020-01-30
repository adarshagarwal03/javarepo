package com.lti.calc;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 
 * @author lti
 *
 */

public class Calculator {

	public int add(int x, int y) {
		return x + y;
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int x = sc.nextInt();
		System.out.println("Enter Second value");
		int y = sc.nextInt();
		Calculator c = new Calculator();
		int result = c.add(x, y);
		int result1 = c.sub(x, y);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(Math.sqrt(x));
	}

	public static void main(int[] args) {

	}

}
