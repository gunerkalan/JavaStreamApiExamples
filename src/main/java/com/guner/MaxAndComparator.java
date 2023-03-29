package com.guner;

import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {
    public static Person getOldestPerson(List<Person> people){
        Person oldestPerson = new Person("",0,"");
        for(Person person: people){
            if(person.getAge()>oldestPerson.getAge()){
                oldestPerson=person;
            }
        }
        return oldestPerson;
    }

    public static Person getOldestPersonForMap(List<Person> people){
        return people.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
    }
}
