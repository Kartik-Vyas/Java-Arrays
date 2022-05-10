package vyas.Arrays;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {5,8,12,7,6,2,4};
        int k = 4;
        int temp;
        for(int i =0;i<k; i++)
        {
            for(int j=i+1; j< arr.length; j++)
            {
                if(arr[j]>arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String result = Arrays.toString(arr);
        System.out.println(result);
        System.out.println("the kth largest element is : " + arr[k-1]);
    }
}
