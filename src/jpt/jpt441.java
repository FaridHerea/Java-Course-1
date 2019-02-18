package jpt;

public enum jpt441 {
	farid("nice", "22"),
	andreea("cutie", "27"),
	julia("bigmistake","12");
	
	private final String desc;
	private final String year;
	
	jpt441(String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
}
