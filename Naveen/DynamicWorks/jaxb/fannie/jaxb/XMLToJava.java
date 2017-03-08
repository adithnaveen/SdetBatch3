package fannie.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLToJava {
	public static void main(String[] args) {
		File file = new File("JAXBCustomer.xml");
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller jaxbUnmarshller  = jaxbContext.createUnmarshaller();
			Customer cust = (Customer)jaxbUnmarshller.unmarshal(file);
			System.out.println(cust);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
