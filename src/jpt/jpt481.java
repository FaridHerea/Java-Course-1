package jpt;

public class jpt481 {
	private int sum;
	private final int NUMBER;
	
	public jpt481(int x) {
		NUMBER = x;
	}
	public void add() {
		sum+=NUMBER;
	}
	public String toString() {
		return String.format("sum = %d\n", sum);
	}
}
