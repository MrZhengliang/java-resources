package com.splatform.day0126;

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
