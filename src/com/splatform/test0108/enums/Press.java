package com.splatform.test0108.enums;

public enum Press {
	QINGHUA("清华大学出版社"),
	BEIJING("北京大学出版社"),
	DIANZI("电子工业出版社"),
	JIXIE("机械工业出版社"),
	ZAZHI("杂志期刊出版社");
	private String name;
	private Press(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
