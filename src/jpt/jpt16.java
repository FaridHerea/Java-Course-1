package jpt;

import java.util.Scanner;

class jpt16 {
	public static void main(String[] ars) {
		Scanner input = new Scanner(System.in);
		jpt161 jpt161Object = new jpt161();
		System.out.println("Enter name of 1st gf here: ");
		String temp = input.nextLine();
		jpt161Object.setName(temp);
		jpt161Object.saying();
	}

}
