package com.splatform.day0126;

public class PersonInterImpl implements PersonInter{

	@Override
	public String printPersonInfo(Person person) {
		
		return "姓名:"+person.getName()+"\n年龄:"+person.getAge()+"\n性别:"+person.getSex().getName()+"\n==============";
	}

}
