/**
 * 
 */
package com.splatform.test0108.domain;

import java.util.ArrayList;
import java.util.List;

import com.splatform.test0108.enums.Sex;

/**
 * @author 
 *
 */
public class Reader {
	
	private String name;
	
	private Sex sex;

	private List<Book> bookList;
	
	
	public Reader() {
		super();
	}
	
	//构造读者类
	public Reader(String name, Sex sex) {
		this.name = name;
		this.sex = sex;
		bookList = new ArrayList<Book>();
	}
	/**
	 * 借书
	 * @param book
	 */
	public void borrow(Book book){
		bookList.add(book);
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Reader [name=" + name + ", sex=" + sex + ", bookList="
				+ bookList + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bookList == null) ? 0 : bookList.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reader other = (Reader) obj;
		if (bookList == null) {
			if (other.bookList != null)
				return false;
		} else if (!bookList.equals(other.bookList))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}

	
	/**
	 * 打印借阅的图书信息
	 */
	public void print() {
		System.out.println("--------");
		System.out.println(this.name+" 借阅明细:");
		System.out.println("==============================================");
		System.out.println("图书名称          出版社                          借阅       编号        类型描述");
		System.out.println("==============================================");
		for(Book book:bookList){
			System.out.println(book.getName()+"    "+book.getPress().getName()+
					"        "+book.getBorrowStatus()+"     "+book.getBookType().getName()+"     "+book.getBookType());
		}
	}
}
