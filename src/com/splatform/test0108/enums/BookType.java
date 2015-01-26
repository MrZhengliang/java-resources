package com.splatform.test0108.enums;

public enum BookType {
	/**科学**/SCIENCE("科学"),
	/*医学*/MEDICINE("医学"),
	/*文学*/LITERATURE("文学"),
	/*饮食*/FOODCOOKING("饮食"),
	/*杂志*/MAGAZINE("杂志");
	private String name;
	private BookType(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
