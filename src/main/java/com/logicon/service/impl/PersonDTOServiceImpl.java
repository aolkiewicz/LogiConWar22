package com.logicon.service.impl;

import com.logicon.dto.PersonDTO;
import com.logicon.service.PersonDTOService;

import java.time.LocalDate;

/**
 * Created by Admin on 2016-06-10.
 */
public class PersonDTOServiceImpl implements PersonDTOService {

    private PersonDTO Person;

    public PersonDTOServiceImpl(String newName, String newSurname, String newCity, LocalDate newBornDate)
    {
        Person=new PersonDTO( newName,newSurname,newCity,newBornDate);
    }


    public PersonDTO register(PersonDTO Person) {
    return null;
    }
}
