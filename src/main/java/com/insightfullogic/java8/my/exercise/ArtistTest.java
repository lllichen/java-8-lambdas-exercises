package com.insightfullogic.java8.my.exercise;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lichen@daojia.com on 2018-1-6.
 */
public class ArtistTest {

    public static void main(String[] args) {


        Thread t = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("111");
            }
        } );

        Thread t1 = new Thread( ()->System.out.println(111) );




        Predicate<Integer> atLeast5 = x -> x > 5;



        List<Integer>  numbers = new ArrayList<>( );

        int count = 0;
        for (Integer integer : numbers) {
            if (integer <100) {
                count++;
            }
        }

        long value = numbers.stream().filter( x -> x < 100 ).count();
    }
}
