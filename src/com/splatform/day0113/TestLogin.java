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
		//�������û���
		System.out.println("�������û���:");
		Scanner scan = new Scanner(System.in);
		String uName = scan.nextLine();
		
		System.out.println("���������:");
		String pwd = scan.nextLine();
		
		//ִ�е�½
		boolean result = testU.login(uName, pwd);
		if(result){
			System.out.println("��½�ɹ�!");
			System.out.println("��������û���:"+uName+"������:"+pwd);
		}else{
			System.out.println("��½ʧ��!�û������������");
		}
		
	}

}
