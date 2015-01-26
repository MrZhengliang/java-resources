package com.splatform.day0126;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(19,"Test1", Sex.MAN);
		Person p2 = new Person(21,"Ð¡ºì", Sex.WOMAN);
		
		PersonInter personIm = new PersonInterImpl();
		System.out.println(personIm.printPersonInfo(p1));
		System.out.println(personIm.printPersonInfo(p2));
	}
}
