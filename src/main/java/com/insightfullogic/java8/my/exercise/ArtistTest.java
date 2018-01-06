package com.insightfullogic.java8.my.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lichen@daojia.com on 2018-1-6.
 */
public class ArtistTest {

    public static void main(String[] args) {
        List list = new ArrayList<String>(  );
        list = Stream.of("a","b","c").collect( Collectors.toList());
    }
}
