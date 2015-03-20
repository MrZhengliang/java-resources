package com.splatform.day0312;

import java.util.HashMap;
import java.util.Map;

public class TestJson {
	
	public static void main(String[] args){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("OrderStatus", 1);
		Integer status = (Integer) map.get("OrderStatus");
		System.out.println("OrderStatus:"+status);
	}
}
