/**
 * 
 */
package com.splatform.test0108.main;

import com.splatform.test0108.domain.Book;
import com.splatform.test0108.domain.Reader;
import com.splatform.test0108.enums.BookType;
import com.splatform.test0108.enums.Press;
import com.splatform.test0108.enums.Sex;

/**
 * @author 
 *
 */
public class TestMain {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Book book1 = new Book("���ݿ�ԭ��", Press.QINGHUA, BookType.SCIENCE,"�������");
		Book book2 = new Book("ҽѧ������", Press.BEIJING, BookType.MEDICINE,"�������");
		Book book3 = new Book("ƽ��������", Press.BEIJING, BookType.LITERATURE,"�������");
		Book book4 = new Book("��ʳ�뽡��", Press.JIXIE, BookType.FOODCOOKING,"�������");
		Book book5 = new Book("���������", Press.BEIJING, BookType.SCIENCE,"�������");
		Book book6 = new Book("�������ѧ", Press.ZAZHI, BookType.MAGAZINE,"���ܽ���");
		
		
		Reader liHong = new Reader("���",Sex.WOMAN);
		Reader xiaoMing = new Reader("Ф��",Sex.WOMAN);
		
		liHong.borrow(book1);
		liHong.borrow(book2);
		liHong.borrow(book3);
		
		xiaoMing.borrow(book4);
		xiaoMing.borrow(book5);
		xiaoMing.borrow(book6);
	
		liHong.print();
		
		xiaoMing.print();
	}
}
