/**
 * 
 */
package com.splatform.day0119;


/**
 * @author 
 *
 */
public class Date {

	private int year;
	private int month;
	private int day;
	
	
	
	public Date() {
		this.year = 2000;
		this.month = 1;
		this.day = 1;
	}
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "今天是:" + year + "年, " + month + "月, " + day + "日";
	}
	
	
	/**
	 * 计算闰年中任意月份包含天数
	 */
	public int getDays(){
		int tianshu=0;
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			tianshu=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			tianshu=30;
			break;
		case 2:
			if(isLeap(year)==true)
			{
				tianshu= 29;
			}
			else {
				tianshu=28;
			}
			break;
		}
		return tianshu;
	}
	
	
	/**
	 * 是否是闰年
	 * @return
	 */
	public boolean isLeap(int year){
		if((year%4==0&&year%100!=0)||(year%400==0)){
			return true;
		}else{ 
			return false;
		}
	}
}
