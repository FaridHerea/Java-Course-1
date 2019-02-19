package methodPracticeNoUI;

import java.util.Scanner;

public class simpleSructure {
	public static void main(String[] args) {
		
		// Writing text
		System.out.println("Hello everybody!");
		System.out.println("Welcome to The Happy Fish program!");
		
		// Variables
		double tunaValue;
		tunaValue = 5.28;
		System.out.print("The curent value for tuna is "+tunaValue);
		System.out.println(".");
		
		// User Input
		Scanner farid = new Scanner(System.in);
		System.out.println("Type something and I bet that I can repeat after you!");
		System.out.print(farid.nextLine());
		System.out.println("... told ya!");
		
		// Basic Calculator
		Scanner calculator = new Scanner(System.in);
		int fnum, snum, answer;
		System.out.println("Now enter number!");
		fnum = calculator.nextInt();
		System.out.println("Another!");
		snum = calculator.nextInt();
		answer = fnum + snum;
		System.out.print(fnum);
		System.out.print(" plus " +snum);
		System.out.print(" is " +answer);
		System.out.println("! Quick mafs! Big Shaq! Ya no!");
		
		// Increment Operators
		Scanner increment = new Scanner(System.in);
		int tuna, bass, fish;
		System.out.println("Enough foolig around, these aren't the droids you're looking for!");
		System.out.println("How much tuna you got back there?");
		tuna = increment.nextInt();
		System.out.println("How about that bass?");
		bass = increment.nextInt();
		fish = tuna + bass;
		System.out.print("So you've got " +fish);
		System.out.println(" fish there?");
		tuna++;
		System.out.print("Now, if I had 1 tuna, we would have had " +tuna);
		System.out.print(" tuna and " +bass);
		System.out.println(" bass.");
		tuna--;
		System.out.print("But I don't! So we've got only " +tuna);
		System.out.print(" tuna and " +bass);
		System.out.println(" bass.");
		bass += 28;
		System.out.print("What I do have is 28 bass, our total reaching " +bass);
		System.out.println(".");
		System.out.println("'Cause I'm all about that bass, 'bout that bass, no treble.");
		bass *= 2;
		System.out.print("Also, I have some new merchandise which will double our bass to a number of " +bass);
		System.out.println(".");
		System.out.println("'Cause I'm all about that bass, 'bout that bass, no treble.");
		
		//if statement
		System.out.println("Do you like fish maph?");
		Scanner yorn = new Scanner(System.in);
		String ans;
		ans=yorn.nextLine();
		if ("yes".equals(ans)){
			System.out.println("Alrighty than! Onward we go!");
		} else if ("no".equals(ans)){
			System.out.println("... sad, but who cares. Onward we go!");
		} else {
			System.out.println("Didn't quite get that, but onward we go!");
		}
		
		//logical operators
	//	System.out.println("Now, lets talk about weight.")
	//	System.out.println("How much weight does your fish have?")
	}
}
