package com.coderlyfe.DataStructuresAndAlgorithms;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    @Test
    public void mergeSortTest() {
        MergeSort mergeSort = new MergeSort();
        int[] array = {8,5,2,3,4,1,7,6,20};
        mergeSort.mergeSort(array);
        String results = "";
        for(int i=0; i < array.length; i++){
            results+=Integer.toString(array[i]);
        }
        assertEquals(results,"1234567820");
    }

    @Test
    public void mergeSortOneItems() {
        MergeSort mergeSort = new MergeSort();
        int[] array = {8};
        mergeSort.mergeSort(array);
        String results = "";
        for(int i=0; i < array.length; i++){
            results+=Integer.toString(array[i]);
        }
        assertEquals(results,"8");
    }

    @Test
    public void mergeSortZeroItems() {
        MergeSort mergeSort = new MergeSort();
        int[] array = new int[0];
        mergeSort.mergeSort(array);
        String results = "";
        for(int i=0; i < array.length; i++){
            results+=Integer.toString(array[i]);
        }
        assertEquals(results,"");
    }

}