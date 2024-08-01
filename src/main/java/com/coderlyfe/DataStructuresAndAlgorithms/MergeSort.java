package com.coderlyfe.DataStructuresAndAlgorithms;

public class MergeSort {

         /*public static void mergeSort(int[] array){
        if(array.length >= 2){
            int mid = array.length /2;
            int l=0, r=0;
            int[] left = new int[mid];
            int[] right = new int[array.length-mid];

            for(int i = 0; i < array.length; i++){
                if(l < left.length){
                    left[l] = array[i];
                    l++;
                }else{
                    right[r] = array[i];
                    r++;
                }
            }

            mergeSort4(left);
            mergeSort4(right);
            merge4(left, right, array);
        }
    }

    public static void merge(int[] left, int[] right, int[] array){

        int l=0, r=0, i=0;
        int lSize = left.length;
        int rSize = right.length;

        while(l < lSize && r < rSize){
            if(left[l] < right[r]){
                array[i] = left[l];
                l++;
            }else{
                array[i] = right[r];
                r++;
            }
            i++;
        }

        while(l < lSize){
            array[i] = left[l];
            l++;
            i++;
        }

        while(r < rSize){
            array[i] = right[r];
            r++;
            i++;
        }
    }*/


    public void mergeSort(int[] array){
        if(array.length >= 2){
            int l=0, r=0;
            int mid = array.length/2;
            int[] left = new int[mid];
            int[] right = new int[array.length-mid];

            for(int i = 0; i < array.length; i++){
                if(i < left.length){
                    left[l] = array[i];
                    l++;
                }else{
                    right[r] = array[i];
                    r++;
                }
            }

            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }

    public void merge(int[] array, int[] left, int[] right){
        int i=0, l=0, r=0;
        int lSize = left.length;
        int rSize = right.length;

        while(l < lSize && r < rSize){
            if(left[l] < right[r]){
                array[i] = left[l];
                l++;
            }else{
                array[i] = right[r];
                r++;
            }
            i++;
        }

        while( l <lSize){
            array[i] = left[l];
            l++;
            i++;
        }
        while(r < rSize){
            array[i] = right[r];
            r++;
            i++;
        }
    }

    }
