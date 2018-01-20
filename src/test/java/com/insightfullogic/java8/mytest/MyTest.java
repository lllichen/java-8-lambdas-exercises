package com.insightfullogic.java8.mytest;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.Track;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.lang.Character.reverseBytes;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

/**
 * Created by lichen@daojia.com on 2018-1-6.
 */
public class MyTest {


    @Test
    public void testStream() {
        List<String> collected = Stream.of( "a", "b", "hello" ).map( string -> string.toUpperCase() ).collect( toList() );
        assertEquals( asList( "A", "B", "HELLO" ), collected );
    }


    @Test
    public void testFilter() {
        List<String> beginningWithNumbers = new ArrayList<>();
        for (String value : asList( "a", "1abc", "abc1" )) {
            if (isDigit( value.charAt( 0 ) )) {
                beginningWithNumbers.add( value );
            }
        }
        assertEquals( asList( "1abc" ), beginningWithNumbers );

        List<String> beginningWithNumbers2 = Stream.of( "a", "1abc", "abc1" ).filter( value -> isDigit( value.charAt( 0 ) ) ).collect( toList() );
        assertEquals( asList( "1abc" ), beginningWithNumbers2 );
    }


    @Test
    public void testFlatMap(){
        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());
        assertEquals(asList(1, 2, 3, 4), together);
    }

    @Test
    public void testMinAndMax(){
        List<Track> tracks = asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));
        Track shortestTrack = tracks.stream().min( Comparator.comparing( track -> track.getLength() ) ).get();
        assertEquals( tracks.get( 1 ),shortestTrack );
    }


    @Test
    public void testReduce(){
        int count = Stream.of(1, 2, 3)
                .reduce(0, (acc, element) -> acc + element);
        assertEquals(6, count);

        asList(1, 2).stream().toString();
    }

    @Test
    public void testAdd(){
        int value = Stream.of( 12,3 ).reduce( 0,(acc,element)->acc+element );

    }

    @Test
    public void testCount(){
        List<Artist> artists = asList(  );
        artists.stream().flatMap( artist->artist.getMembers() ).count();

    }
}
