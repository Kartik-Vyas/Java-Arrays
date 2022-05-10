package vyas.Arrays;

import java.util.ArrayList;

public class OddEvenSumAndCount {
    public static void main(String[] args) {
        int[] arr = {8,5,10,12,3,1,4};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even.add(arr[i]);
            }
            else
            {
                odd.add(arr[i]);
            }
        }
        int evenSum=0,oddSum = 0;
        for (int sum1 : even)
        {
            evenSum = evenSum+sum1;
        }
        for (int sum2 : odd)
        {
            oddSum = oddSum+sum2;
        }
        System.out.println("Sum of even numbers is " + evenSum + ".  Total no. of even are " + even.size());
        System.out.println("Sum of even numbers is " + oddSum + ".  Total no. of even are " + odd.size());
    }
}
