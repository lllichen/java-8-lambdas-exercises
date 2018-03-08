package com.insightfullogic.java8.my.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

/**
 * Created by lichen@daojia.com on 2018-3-8.
 */
public class ExerciseMap {


    public static void main(String[] args) {

        List<Integer> list = asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        list.stream().map( value->String.valueOf( value )+"a" ).forEach( value-> System.out.println(value) );














        List<String> collected = new ArrayList<>();
        for (String string : asList("a", "b", "hello")) {
            String uppercaseString = string.toUpperCase();
            collected.add(uppercaseString);
        }

        List<String> newCollected = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase())
                .collect(toList());


    }
}
