package jpt;

public class jpt461 {
	private String first;
	private String last;
	private static int members = 0;
	
	public jpt461(String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
	}
}
