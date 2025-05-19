package com.coderlyfe.DataStructuresAndAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {


    public static int smallestSubArrayGreaterThanOrEqualToK(int[] array, int k){
        int currentWindowSum = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;

        for(int end = 0; end < array.length; end++){
            currentWindowSum += array[end];

            while(currentWindowSum >= k){
                min = Math.min(min, end - start +1);
                currentWindowSum -= array[start];
                start++;
            }
        }
        return min;

    }

    public static int maxSum(int[] array, int k){
        int currentRunningSum = 0;
        int max = Integer.MIN_VALUE;
        int size = k -1;

        for(int i = 0; i < array.length; i++){
            currentRunningSum += array[i];
            if(i >= size){
                max = Math.max(max, currentRunningSum);
                currentRunningSum -= array[ i - size];
            }
        }
        return max;
    }

    public static int smallestSubArray(int[] array, int k){
        int currentRunningSum = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;

        for(int end = 0; end < array.length; end++){
            currentRunningSum += array[end];
            while(currentRunningSum >= k){
                min = Math.min(min, end - start +1);
                currentRunningSum -= array[start];
                start++;
            }
        }
        return min;
    }


    public static int longestSubstringWithXDistinctChars(String[] array, int k){
        Map<String, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int start = 0;

        for(int end = 0; end < array.length; end++){
            String key = array[end];
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }else{
                map.put(key, 1);
            }
            while(map.size() > k){
                String dec = array[start];
                map.put(key, map.get(dec)-1);

                if(map.get(dec) == 0){
                    map.remove(key);
                }
                start++;
            }

            max = Math.max(max, end - start + 1);
        }
        return max;
    }


    public static void main(String[] args){
        int[] array = new int[]{4,2,1,7,8,1,2,8,1,0};
        String[] string = new String[]{"A","A","A","H","H","B","B","C","B","C"};
        System.out.println(maxSum(array, 3));
        //System.out.println(smallestSubArrayGreaterThanOrEqualToK(array, 8));
        //System.out.println(smallestSubArray(array, 8));
        //System.out.println(longestSubstringWithXDistinctChars(string, 2));

        char[][] letters = new char[3][4];
        String word = "ABCCED";
        letters[0][0] = 'A';
        letters[0][1] = 'B';
        letters[0][2] = 'C';
        letters[0][3] = 'E';
        letters[1][0] = 'S';
        letters[1][1] = 'F';
        letters[1][2] = 'C';
        letters[1][3] = 'S';
        letters[2][0] = 'A';
        letters[2][1] = 'D';
        letters[2][2] = 'E';
        letters[2][3] = 'E';
        //depthFirstSearch(letters, 0);




    }
}
