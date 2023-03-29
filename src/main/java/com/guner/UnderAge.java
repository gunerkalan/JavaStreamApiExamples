package com.guner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {

    public static Set<String> getKidNames(List<Person> people){
        Set<String> kids = new HashSet<>();
        for (Person person : people){
            if(person.getAge()<18){
                kids.add(person.getName());
            }
        }
        return kids;
    }

    public static Set<String> getKidNamesForMap(List<Person> people){
       return people.stream().filter(p->p.getAge()<18).map(Person::getName).collect(Collectors.toSet());
    }
}