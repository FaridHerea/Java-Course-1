package jpt;

public class jpt161 {
	private String girlName;
	public void setName(String name) {
		girlName=name;
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("Your 1st gf was %s", getName());
	}
}
