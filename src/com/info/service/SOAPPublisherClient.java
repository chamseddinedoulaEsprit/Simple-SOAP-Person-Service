package com.info.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.info.model.Person;

public class SOAPPublisherClient {

	public static void main(String[] args) throws MalformedURLException {
		
		URL wsdlURL = new URL("http://localhost:8888/ws/person?wsdl");
		
		QName qname = new QName("http://service.info.poly.com/", "PersonServiceImplService");
		Service service = Service.create(wsdlURL, qname);
		
		PersonService ps = service.getPort(PersonService.class);
		
		Person p1 = new Person(); p1.setName("pmpm"); p1.setId(1); p1.setAge(30);
		Person p2 = new Person(); p2.setName("Sarra"); p2.setId(2); p2.setAge(25);
		Person p3 = new Person(); p3.setName("lmlo"); p3.setId(3); p3.setAge(22);
		Person p4 = new Person(); p4.setName("llll"); p4.setId(4); p4.setAge(30);
		
		System.out.println("Add Person 1 Status=" + ps.addPerson(p1));
		System.out.println("Add Person 2 Status=" + ps.addPerson(p2));
		System.out.println("Add Person 3 Status=" + ps.addPerson(p3));
		System.out.println("Add Person 4 Status=" + ps.addPerson(p4));
	}

}
