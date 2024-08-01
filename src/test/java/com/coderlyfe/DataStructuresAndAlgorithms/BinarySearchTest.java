package com.coderlyfe.DataStructuresAndAlgorithms;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BinarySearchTest {

    @Test
    public void testBinarySearchBasicTest() {
        System.out.println("-----------Binary search-------");
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        BinarySearch binarySearch = new BinarySearch();
        int results = binarySearch.binarySearch(array, 0, array.length-1, 8);
        assertEquals(7, results);
    }

    @Test
    public void testBinarySearchTargetNotFoundTest() {
        System.out.println("-----------Binary search-------");
        int[] array = {1,2,3,4,4,6,7,8,9,10};

        BinarySearch binarySearch = new BinarySearch();
        int results = binarySearch.binarySearch(array, 0, array.length-1, 5);
        assertEquals(-1, results);
    }


    @Test
    public void testBinarySearchEmptyArrayTest() {
        System.out.println("-----------Binary search-------");
        int[] array = new int[1];

        BinarySearch binarySearch = new BinarySearch();
        int results = binarySearch.binarySearch(array, 0, array.length-1, 5);
        assertEquals(-1, results);

    }
}