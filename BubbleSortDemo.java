package vyas.Arrays;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {36,19,56,12,3,14};
        for(int i=0;i<arr.length;i++)
        {
            int value =0;
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    value=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=value;
                }
                else
                {
                    continue;
                }
            }
        }
        String result = Arrays.toString(arr);
        System.out.println(result);
    }
}
