package vyas.LeetCode;

import java.util.Arrays;

//long approach effective solution on GreatestNoOfCandies

public class GreatestNoOfCandiesTrial {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int max =0;
        int[] value = new int[candies.length];
        boolean[] result = new boolean[candies.length];
        for(int i =0;i<candies.length;i++)
        {
            if(max < candies[i])
            {
                max = candies[i];
            }
            value[i] = candies[i]+3;
        }
        for(int i =0;i<candies.length;i++)
        {
            if(max <= value[i])
            {
                result[i] = true;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}

