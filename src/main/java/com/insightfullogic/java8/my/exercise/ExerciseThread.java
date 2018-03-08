package com.insightfullogic.java8.my.exercise;

/**
 * Created by lichen@daojia.com on 2018-3-8.
 */
public class ExerciseThread {


    public static void main(String[] args) {
        Thread t = new Thread( ()-> System.out.println("Hello World") );
        Runnable runnable = ()->System.out.println("Hello World") ;
        t.start();
    }
}
