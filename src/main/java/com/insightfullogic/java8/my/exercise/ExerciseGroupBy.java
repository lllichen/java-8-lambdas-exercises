package com.insightfullogic.java8.my.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

/**
 * Created by lichen@daojia.com on 2018-3-8.
 */
public class ExerciseGroupBy {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        Map<Integer,List<Integer>> newMap = list.stream().collect(groupingBy( value -> value));

    }
}
