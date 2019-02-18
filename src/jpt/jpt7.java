package jpt;

import java.util.Scanner;

class jpt7 {
	public static void main(String args[]) {
		Scanner calculator = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = calculator.nextDouble();
		System.out.println("Enter second number: ");
		snum = calculator.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}
