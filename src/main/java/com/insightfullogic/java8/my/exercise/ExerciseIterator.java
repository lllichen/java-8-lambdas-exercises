package com.insightfullogic.java8.my.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-3-8.
 */
public class ExerciseIterator {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        list.forEach( value-> System.out.println(value) );
    }
}
