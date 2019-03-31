/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 *
 * @author pashak
 */
public class PersonAgeComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getBirthDate().before(o2.getBirthDate())) 
            return -1;
        else if (o1.getBirthDate().after(o2.getBirthDate()))
            return 1;
        else 
            return 0;
        
    }
    
}
