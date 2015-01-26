/**
 * 
 */
package com.splatform.day0112;

/**
 * @author 
 *
 */
public class TestTwoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[][] arr = new String[][] {
//				{"a1","a2","a3","a4","a5","a6"},
//				{"b1","b2","b3","b4","b5","b6"},
//				{"c1","c2","c3","c4","c5","c6"},
//				{"d1","d2","d3","d4","d5","d6"},
//				{"e1","e2","e3","e4","e5","e6"}
//			};
		
		String[][] arr = new String[][] {{"1","2"},{"3","4"},{"5","6"}};
//		for(int i =0;i< arr.length;i++){
//			  for(int j = i+1;j< arr[i].length;i++){
//			    System.out.println(arr[i][j]+arr[j][i]+","+arr[j][j]);
//			  }
//			}
		
		TestTwoArray.getCombation(arr, 0);
	}
	
	
	/*
	 * n为0代表组合所有
	 */
	public static String getCombation(String[][] arra,int n){
		
		for(int i=0;i<arra.length;i++){//取二维中的每个元素
			//System.out.println(arra[i]);
			for(int j=0;j<arra[i].length;j++){
				System.out.println(arra[i][j]+arra[j][i]);
			}
		}
		
		return "";
	}
}
