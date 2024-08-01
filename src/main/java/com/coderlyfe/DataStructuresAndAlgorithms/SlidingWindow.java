package com.coderlyfe.DataStructuresAndAlgorithms;

public class SlidingWindow {

    /*public static int maxSum(int[] array, int k){
        int currentMaxSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int size = k - 1;
        for(int i= 0; i < array.length; i++){
            currentMaxSum+= array[i];
            if( i >= size){
                maxSum = Math.max(currentMaxSum, maxSum);
                currentMaxSum -= array[i - size];
            }
        }
        return maxSum;

    }

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

    public static int longestSubStringWithKDistinctCharcters(Character[] arry, int k){
        return 0;

    }

    public static int maxSum2(int[] array, int k){
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



        public static int longestSubstringWithXDistinctChars(String[] array, int k){
        int max = Integer.MIN_VALUE;
        Map<String, Integer> hashmap = new HashMap<>();
        int start = 0;
        for(int i = 0; i < array.length; i++) {
            String key = array[i];
                hashmap.put(key, hashmap.getOrDefault(key,0) + 1);

                while (hashmap.size() > k) {
                    String dec = array[start];
                    hashmap.put(dec, hashmap.get(dec) - 1);
                    if(hashmap.get(dec) == 0) hashmap.remove(dec);
                    start++;
                }
            max = Math.max(max, i - start + 1);
        }
        return max;
    }


    //[['A','B','C','E'],
    //['S','F','C','S'],
    //['A','D','E','E']]
    //word = “ABCCED”
    private static void depthFirstSearch(char[][] letters, int src){
        boolean[] visited = new boolean[letters.length];
        dfsHelper(letters, visited, src);
    }

    private static void dfsHelper(char[][] letters, boolean[] visited, int src){
        if(visited[src]){
            return;
        }else{
            visited[src] = true;
        }

        for(int i = 0; i < letters.length; i++){
            System.out.println("Visited: "+letters[src][i] + " at index: "+ "["+src+"]"+ "["+i+"]");
            if(!visited[i]){
                dfsHelper(letters, visited, i);
            }
        }
    }*/


    public static int maxSum(int[] array, int k){
        int max = Integer.MIN_VALUE;
        int currMax = 0;

        for(int i = 0; i < array.length; i++){
            currMax += array[i];
            if(i >= k - 1){
                max = Math.max(max, currMax);
                currMax = currMax - (array[i - (k-1)]);
            }

        }
        return max;
    }

    public static void main(String[] args){
        int[] array = new int[]{4,2,1,7,8,1,2,8,1,0};
        String[] string = new String[]{"A","A","A","H","H","B","B","C","B","C"};
        System.out.println(maxSum(array, 3));
        //System.out.println(maxSum(array, 3));
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
