package com.msg.consumer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageConsumer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.msg.beans.Emp;

public class HelloConsumer {

	public static void consumeMessage() {
		try {

			// creating a connection
			ConnectionFactory cf = new com.sun.messaging.ConnectionFactory();
			Connection connection = cf.createConnection();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createTopic("HelloWorld");
			MessageConsumer consumer = session.createConsumer(destination);
			connection.start();

			System.out.println("Start listen HelloWorld Queue from HelloConsumer.java");
			long now = System.currentTimeMillis();
			do {
				// receive our message
			
				
				TextMessage m = (TextMessage) consumer.receive();
				System.out.println(m.getText() + " timestamp=" + m.getJMSTimestamp());
				
				MapMessage mm  = (MapMessage) consumer.receive();
				System.out.println(mm.getString("msg") +" ->  map message.... ");

				ObjectMessage om = (ObjectMessage) consumer.receive();
				Emp empObj = (Emp) om.getObject();
				System.out.println(empObj);
				System.out.println("------------------------------");
				
			} while (now + 1000 * 60 * 10 > System.currentTimeMillis());
			System.out.println("End listen HelloWorld Queue from HelloConsumer.java");

			// close everything
			session.close();
			connection.close();
			consumer.close();

		} catch (JMSException ex) {
			System.out.println("Error = " + ex.getMessage());
		}
	}

	public static void main(String args[]) {
		HelloConsumer.consumeMessage();
	}
}