package jpt;

class jpt32 {
	public static void main(String[] args) {
		int jpt32[]= {3,4,5,6,7};
		change(jpt32);
		
		for(int y:jpt32)
			System.out.println(y);
	}
	
	public static void change(int x[]) {
		for(int counter=0;counter<x.length;counter++)
			x[counter]+=5;
	}
}
