/**
 * 
 */
package com.splatform.test0108.domain;

import com.splatform.test0108.enums.BookType;
import com.splatform.test0108.enums.Press;

/**
 * @author 
 *
 */
public class Book {

	private String name;
	private Press press;
	private BookType bookType;
	
	/**
	 * ΩË‘ƒ Ù–‘
	 */
	private String borrowStatus;
	
	public Book() {
		super();
	}
	public Book(String name, Press press, BookType bookType,String borrowStatus) {
		this.name = name;
		this.press = press;
		this.bookType = bookType;
		this.borrowStatus = borrowStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Press getPress() {
		return press;
	}
	public void setPress(Press press) {
		this.press = press;
	}
	public BookType getBookType() {
		return bookType;
	}
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	
	public String getBorrowStatus() {
		return borrowStatus;
	}
	public void setBorrowStatus(String borrowStatus) {
		this.borrowStatus = borrowStatus;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", press=" + press + ", bookType="
				+ bookType + ", borrowStatus=" + borrowStatus + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bookType == null) ? 0 : bookType.hashCode());
		result = prime * result
				+ ((borrowStatus == null) ? 0 : borrowStatus.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((press == null) ? 0 : press.hashCode());
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
		Book other = (Book) obj;
		if (bookType != other.bookType)
			return false;
		if (borrowStatus == null) {
			if (other.borrowStatus != null)
				return false;
		} else if (!borrowStatus.equals(other.borrowStatus))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (press != other.press)
			return false;
		return true;
	}
	
	
}
