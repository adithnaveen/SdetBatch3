package fannie.jaxb2;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public class BookMain {
	public static void main(String[] args) {
		ArrayList<Book> booklist = new ArrayList<Book>();
		
		Book b1 = new Book();
		b1.setIsbn("12112");
		b1.setName("Let US C");
		b1.setAuthor("Yahwanth Kanetkar");
		b1.setPublisher("WILEY");
		
		Book b2  = new Book();
		b2.setIsbn("222333");
		b2.setName("Complete Reference Java");
		b2.setAuthor("Naughton");
		b2.setPublisher("Pearson");
		
		
		booklist.add(b1);
		booklist.add(b2);
		
		
		BookStore bookStore = new BookStore();
		bookStore.setName("Sapna Book Store");
		bookStore.setLocation("Bengaluru");
		bookStore.setBookList(booklist);
		
		
		// marshller 
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(BookStore.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			// write it to console 
			jaxbMarshaller.marshal(bookStore, System.out);
			
			jaxbMarshaller.marshal(bookStore, new File("./bookstore.xml"));
		} catch (PropertyException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		System.out.println("Created.... ");
		
		
		
		
		
		
		
		
		
		
		
	}
}
