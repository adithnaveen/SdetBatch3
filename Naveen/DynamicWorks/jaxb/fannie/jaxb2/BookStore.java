package fannie.jaxb2;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
public class BookStore {
	
	// Generates a wrapper element around XML representation. This is 
	// primarily intended to be used to produce a wrapper XML element 
	// around collections. The annotation therefore supports two forms 
	// of serialization shown below.
	private ArrayList<Book> bookList;
	private String name;
	private String location;
	
	@XmlElementWrapper(name="books")
	@XmlElement(name="book")	
	public ArrayList<Book> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 // @XmlTransient
	// this field will not be persisted to file 
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	

	
}
