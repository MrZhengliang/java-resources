/**
 * 
 */
package com.splatform.day0113;

import java.util.Scanner;

/**
 * @author 
 *
 */
public class TestLogin {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		User testU = new User();
		//请输入用户名
		System.out.println("请输入用户名:");
		Scanner scan = new Scanner(System.in);
		String uName = scan.nextLine();
		
		System.out.println("请输入口令:");
		String pwd = scan.nextLine();
		
		//执行登陆
		boolean result = testU.login(uName, pwd);
		if(result){
			System.out.println("登陆成功!");
			System.out.println("您输入的用户名:"+uName+"，口令:"+pwd);
		}else{
			System.out.println("登陆失败!用户名或密码错误");
		}
		
	}

}
