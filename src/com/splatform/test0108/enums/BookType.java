package com.splatform.test0108.enums;

public enum BookType {
	/**��ѧ**/SCIENCE("��ѧ"),
	/*ҽѧ*/MEDICINE("ҽѧ"),
	/*��ѧ*/LITERATURE("��ѧ"),
	/*��ʳ*/FOODCOOKING("��ʳ"),
	/*��־*/MAGAZINE("��־");
	private String name;
	private BookType(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
