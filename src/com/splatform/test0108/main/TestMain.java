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
		

		Book book1 = new Book("数据库原理", Press.QINGHUA, BookType.SCIENCE,"办理借阅");
		Book book2 = new Book("医学与美容", Press.BEIJING, BookType.MEDICINE,"办理借阅");
		Book book3 = new Book("平凡的世界", Press.BEIJING, BookType.LITERATURE,"办理借阅");
		Book book4 = new Book("饮食与健康", Press.JIXIE, BookType.FOODCOOKING,"办理借阅");
		Book book5 = new Book("计算机基础", Press.BEIJING, BookType.SCIENCE,"办理借阅");
		Book book6 = new Book("计算机科学", Press.ZAZHI, BookType.MAGAZINE,"不能借阅");
		
		
		Reader liHong = new Reader("李红",Sex.WOMAN);
		Reader xiaoMing = new Reader("肖明",Sex.WOMAN);
		
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
