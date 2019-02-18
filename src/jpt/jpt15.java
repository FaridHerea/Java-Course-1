package jpt;

import java.util.Scanner;

class jpt15 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		jpt151 jpt151Object = new jpt151 ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		jpt151Object.simpleMessage(name);
	}

}
