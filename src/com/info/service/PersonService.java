package com.info.service;
import com.info.model.Person;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)      
/**
 *
 * @author Administrator
 */
public interface PersonService {
	@WebMethod
	public boolean addPerson(Person p);
	@WebMethod
	public boolean deletePerson(int id);
	@WebMethod
	public Person getPersonByName(String name);
	@WebMethod
	public Person[] getAllPerson();
    
}
