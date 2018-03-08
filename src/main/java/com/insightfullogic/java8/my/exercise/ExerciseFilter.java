package com.insightfullogic.java8.my.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lichen@daojia.com on 2018-3-8.
 */
public class ExerciseFilter {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);


        list.stream().filter( value-> value>10 ).forEach( value-> System.out.println(value) );


        List<Integer> filterList = list.stream().filter( value-> value>10 ).collect( Collectors.toList());







//        List<Integer> newList = new ArrayList<>( );
//        for (Integer integer : list){
//            if(integer > 10){
//                newList.add( integer );
//            }
//        }

    }
}
