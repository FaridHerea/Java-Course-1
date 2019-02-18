package jpt;

public class jpt171 {
	private String girlName;
	
	public jpt171(String name) {
		girlName=name;
	}
	
	public void setName(String name) {
		girlName=name;
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("Your 1st gf was %s\n", getName());
	}
}
