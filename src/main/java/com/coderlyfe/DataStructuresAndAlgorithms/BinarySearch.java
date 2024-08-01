package com.coderlyfe.DataStructuresAndAlgorithms;

public class BinarySearch {

    /*public static int binarySearch(int[] array, int l, int r, int x){
        if(r >= l){
            int mid = l + (r -l) / 2;

            if(array[mid] == x) return mid;

            if(array[mid] > x){
                return binarySearch(array, l, mid-1, x);
            }else{
                return binarySearch(array, mid+1, r, x);
            }
        }else{
            return -1;
        }
    }*/


    public int binarySearch(int[] array, int l, int r, int x){
        if( l <= r){
            int mid = l + ( r - l);

            if(array[mid] == x) return mid;

            if(array[mid] > x){
                return binarySearch(array, l, mid -1, x);
            }else{
                return binarySearch(array, mid+1, r, x);
            }
        }else{
            return -1;
        }
    }

}
