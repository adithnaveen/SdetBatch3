package fannie.jaxb2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class BookMain2 {
	public static void main(String[] args) {
		System.out.println("Output from the file.. ");
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(BookStore.class);
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
	
			BookStore bookStore = (BookStore)
				jaxbUnmarshaller.unmarshal(new FileReader("./bookstore.xml"));
			
			System.out.println(bookStore.getName());
			System.out.println(bookStore.getLocation());
			ArrayList<Book> list = bookStore.getBookList();
			
			for(Book temp : list){
				System.out.println(temp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
