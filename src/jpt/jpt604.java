package jpt;

public class jpt604 {
	private jpt603[] thelist = new jpt603[5];
	private int i = 0;
	
	public void add(jpt603 a) {
		if(i<thelist.length) {
			thelist[i]=a;
			System.out.println("Animal added at index "+i);
			i++;
		}
	}
}
