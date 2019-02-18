package jpt;

public enum jpt451 {
	farid("nice", "22"),
	andreea("cutie", "27"),
	julia("bigmistake","12"),
	nicole("italian", "13"),
	candy("different", "14"),
	erin("iwish", "16");
	
	private final String desc;
	private final String year;
	
	jpt451(String description, String birthday){
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
