package jpt;

public class jpt421 {
	private String name;
	private jpt422 birthday;
	
	public jpt421(String theName, jpt422 theDate) {
		name = theName;
		birthday = theDate;
	}
	
	public String toString() {
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
