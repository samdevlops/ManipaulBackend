package com.saurabh.manipaul;

import com.saurabh.manipaul.entities.entities.Address;
import com.saurabh.manipaul.entities.entities.Hospital;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManipaulBackendSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManipaulBackendSpringBootApplication.class, args);

		// Create a SessionFactory
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// Open a Session
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// Create dummy objects with hardcoded values
		Hospital h1 = new Hospital(2, "Manipaul KR Puram", "8795474764", "samsitrocker@gmail.com", "Bengaluru");
		Address address = new Address(2, 560101, "KR Puram Metro Station", "KR Puram", "Bengaluru", "Karnantaka", "India");

		// Set the one-to-one relationship (assuming a bidirectional mapping)
		h1.setAddress(address);
		address.setHospital(h1);

		// Save the objects (Hibernate will handle cascading)
		session.save(h1);

		// Commit the transaction
		session.getTransaction().commit();

		// Close the Session
		session.close();

		System.out.println("Hospital object saved successfully!");
	}

}
