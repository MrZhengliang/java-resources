package com.splatform.day0112;

//�����ط�һ��
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
		/** ��һ��һά������ȡ��n��Ԫ�������ɵ���� */
		// �����ȡ����ѡ�������forѭ����ʽ
		// ���ﻹҪ���õݹ���㷨getCombination(n,arr)Ҫ����getCombination(n-1,arr);n>=2;
		/*
		 * if(n>=2){ for(int j=0;j<getCombination(n,arr).length;j++){ for(int
		 * i=0;i<getCombination(n-1,arr).length;i++){
		 * getCombination(n,arr)[j]=CurrentValue+getCombination(n-1,arr)[i];} }
		 * } } if(n=1){ for(int i=0;i<arr.length;i++){
		 * getCombination(1,arr)[i]=arr[i]; }}
		 */
		// ����arrҪ����arr.substring(n-1,length);
		String CurrentValue;

		int CurrentIndex;
		return arr;

		// StringBuilder ss=new StringBuilder();

	}
	/*
	 * public static int getLength(String[] arr,int n){
	 * //�����һ��һά������ȡ��n��Ԫ�������ɵ���ϵĸ��� ����������ڱ�Ҫ��δ֪ }
	 */
}
