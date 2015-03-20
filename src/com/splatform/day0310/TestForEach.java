package com.splatform.day0310;

import java.util.Random;

/**
 * <p>descrption: </p>
 * 
 * @author fuzl
 * @date   2015年3月10日
 * @Copyright 2015 Snail Soft, Inc. All rights reserved.
 */
public class TestForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] luck = new int[3];
		Random r = new Random();
		luck[0]=r.nextInt(4);
		luck[1]=r.nextInt(4);
		luck[2]=r.nextInt(4);
		for(int x:luck){
			System.out.println(x);
		}
	}

}
