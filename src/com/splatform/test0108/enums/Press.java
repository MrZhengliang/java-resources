package com.splatform.test0108.enums;

public enum Press {
	QINGHUA("�廪��ѧ������"),
	BEIJING("������ѧ������"),
	DIANZI("���ӹ�ҵ������"),
	JIXIE("��е��ҵ������"),
	ZAZHI("��־�ڿ�������");
	private String name;
	private Press(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
