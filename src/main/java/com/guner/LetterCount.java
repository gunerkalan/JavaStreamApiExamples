package com.guner;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LetterCount {

    public static void main(String[] args) {

    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String...names){
        int total=0;
        for(String name: names){
            if(name.length()>5)
                total++;
        }
        return total;
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFiveForMap(String...names){
        return Arrays.stream(names).filter(u->u.length()>5).mapToInt(String::length).sum();
    }

}
