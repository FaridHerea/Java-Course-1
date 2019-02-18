package jpt;

public class jpt594 {
	private jpt591[] thelist = new jpt591[5];
	private int i=0;
	
	public void add(jpt591 d) {
		if(i<thelist.length) {
			thelist[i]=d;
			System.out.println("Dog added at index "+i);
			i++;
		}
	}
}
