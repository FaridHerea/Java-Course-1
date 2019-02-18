package jpt;

import java.util.EnumSet;

class jpt45 {
	public static void main(String[] args) {
		for(jpt451 people: jpt451.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		
		System.out.println("\n\nAnd now for the range of constants!!!\n");
		
		for(jpt451 people: EnumSet.range(jpt451.andreea, jpt451.candy))
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
	}
}
