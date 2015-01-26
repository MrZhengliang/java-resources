package com.splatform.day0112;

//代码重发一下
public class Combination {
	public static void main(String[] args) {
		String[] arr = { "A", "B", "C", "D" };
		getTwoDimensionArray(arr);
	}

	public static String[][] getTwoDimensionArray(String[] ar) {
		String[][] arr = new String[][] {{"1","2"},{"3","4"}};
		return arr;

	}

	public static String[] getCombination(String[] arr, int n) {
		/** 从一个一维数组中取得n个元素所构成的组合 */
		// 这里采取类似选择排序的for循环方式
		// 这里还要采用递归的算法getCombination(n,arr)要利用getCombination(n-1,arr);n>=2;
		/*
		 * if(n>=2){ for(int j=0;j<getCombination(n,arr).length;j++){ for(int
		 * i=0;i<getCombination(n-1,arr).length;i++){
		 * getCombination(n,arr)[j]=CurrentValue+getCombination(n-1,arr)[i];} }
		 * } } if(n=1){ for(int i=0;i<arr.length;i++){
		 * getCombination(1,arr)[i]=arr[i]; }}
		 */
		// 其中arr要调用arr.substring(n-1,length);
		String CurrentValue;

		int CurrentIndex;
		return arr;

		// StringBuilder ss=new StringBuilder();

	}
	/*
	 * public static int getLength(String[] arr,int n){
	 * //计算从一个一维数组中取得n个元素所构成的组合的个数 这个方法存在必要性未知 }
	 */
}
