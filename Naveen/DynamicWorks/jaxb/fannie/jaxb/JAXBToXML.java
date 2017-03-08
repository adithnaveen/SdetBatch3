package fannie.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

// program to store java object to XML file 
public class JAXBToXML {
	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.setId(101);
		cust.setName("Kanchn");
		cust.setAge(16);

		File file = new File("JAXBCustomer.xml");
		try {

			// The JAXBContext class provides the client's entry point to
			// the JAXB API. It provides an abstraction for managing
			// the XML/Java binding information necessary to implement
			// the JAXB binding framework operations: unmarshal, marshal
			// and validate.

			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// Pretty
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(cust, System.out);
			jaxbMarshaller.marshal(cust, file);

			System.out.println("Data Written to the file... ");
		} catch (PropertyException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
