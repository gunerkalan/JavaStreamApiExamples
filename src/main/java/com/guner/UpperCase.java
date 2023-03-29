package com.guner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {

    public static void main(String[] args) {

    }

    public static Collection<String> mapToUpperCase(String... names){
        Collection<String> upperCaseNames = new ArrayList<>();
        for(String name: names){
            upperCaseNames.add(name.toUpperCase());
        }
        return upperCaseNames;
    }

    public static Collection<String> mapToUpperCaseForMap(String... names){
       return Arrays.stream(names).map(String::toUpperCase).toList();
    }

}
