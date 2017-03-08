package fannie.jaxb2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="book")
// it is possible for us to store / change the order in which the 
// elements in xml are formed 
// optional 
@XmlType(propOrder={"isbn", "name", "author", "publisher"})
public class Book {
	private String name;
	private String author;
	private String publisher;
	private String isbn;
	
	@XmlElement(name="title")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@XmlElement
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@XmlElement
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publisher="
				+ publisher + ", isbn=" + isbn + "]";
	}
	
	
	
	
}
