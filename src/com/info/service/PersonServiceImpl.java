/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info.service;

import com.info.model.Person;
import javax.jws.WebService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "com.info.service.PersonService")
public class PersonServiceImpl implements PersonService {
	private static Map<Integer, Person> persons = new HashMap<Integer, Person>();

	@Override
	public boolean addPerson(Person p) {
		if (p == null) return false;
		if (persons.get(p.getId()) != null) return false;
		persons.put(p.getId(), p);
		return true;
	}

	@Override
	public boolean deletePerson(int id) {
		return persons.remove(id) != null;
	}

	@Override
	public Person getPersonByName(String name) {
		if (name == null) return null;
		Collection<Person> vals = persons.values();
		for (Person p : vals) {
			if (name.equals(p.getName())) return p;
		}
		return null;
	}

	@Override
	public Person[] getAllPerson() {
		Collection<Person> vals = persons.values();
		return vals.toArray(new Person[0]);
	}

}
