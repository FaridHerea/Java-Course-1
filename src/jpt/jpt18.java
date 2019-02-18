package jpt;

class jpt18 {
	public static void main(String[] args) {
		int age = 60;
		
		if (age < 50) {
			System.out.println("You're young");
		} else {
			System.out.println("You are old");
			if (age > 75) {
				System.out.println("You are really old");
			} else {
				System.out.println("Don't worry, you aren't really that old");
			}
		}
	}
}
