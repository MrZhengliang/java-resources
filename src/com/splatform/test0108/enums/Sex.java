package com.splatform.test0108.enums;

public enum Sex {
	MAN("��"),WOMAN("Ů");
	private String name;
	private Sex(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
