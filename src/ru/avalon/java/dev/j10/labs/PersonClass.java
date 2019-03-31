/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author pashak
 */
public class PersonClass implements Person {
    Comparator<Person> pcomp = new PersonComparator().thenComparing(new PersonAgeComparator());
    private final String name;
    private Date birthDate;

    public PersonClass(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }   
    

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object o) {
        return pcomp.compare(this, (PersonClass) o);
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
}
