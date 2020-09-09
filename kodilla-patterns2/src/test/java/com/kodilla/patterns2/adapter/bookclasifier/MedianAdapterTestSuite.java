package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet =  new HashSet<>();
        bookSet.add(new Book("john", "bando" , 1997, "1234"));
        bookSet.add(new Book("johsn", "banxxxdo" , 1996, "1235"));
        bookSet.add(new Book("johcn", "bandoc" , 1995, "1236"));
        bookSet.add(new Book("johz6n", "bagndao" , 1994, "1237"));
        bookSet.add(new Book("j5ohn", "ban7do" , 1993, "1238"));
        bookSet.add(new Book("j4ohn", "band4o" , 1992, "1239"));
        bookSet.add(new Book("jo12hn", "b7ando" , 1991, "1240"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1994, median);


    }

}