package com.splatform.day0126;

public class PersonInterImpl implements PersonInter{

	@Override
	public String printPersonInfo(Person person) {
		
		return "����:"+person.getName()+"\n����:"+person.getAge()+"\n�Ա�:"+person.getSex().getName()+"\n==============";
	}

}
