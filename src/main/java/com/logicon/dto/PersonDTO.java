package com.logicon.dto;

import java.time.LocalDate;

/**
 * Created by Admin on 2016-06-09.
 */
public class PersonDTO {

    private String name;
    private String surname;
    private String city;
    private LocalDate bornDate;


    public PersonDTO(String newName, String newSurname, String newCity, LocalDate newBornDate) {

        this.name=newName;
        this.surname=newSurname;
        this.city=newCity;
        this.bornDate=newBornDate;
    }

}
