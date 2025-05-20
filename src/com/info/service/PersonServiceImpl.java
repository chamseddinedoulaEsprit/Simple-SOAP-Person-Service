/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info.service;
import com.info.model.Person;
import javax.jws.WebService;

/**
 *
 * @author Administrator
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@WebService(endpointInterface ="com.poly.info.service.PersonService")
public class PersonServiceImpl implements  PersonService{
    private static Map<Integer,Person> persons =new HashMap<Integer,Person>();

	@Override
	public boolean addPerson(Person p) {
		if(persons.get(p.getId())!=null)return false ;
        persons.put(p.getId(),p) ;
         return true ;
	}

	@Override
	public boolean deletePerson(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person getPersonByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person[] getAllPerson() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
    
}
