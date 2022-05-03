package vyas.Arrays;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {

        int[] arr = {38,6,13,42,53,2};
        int min;
        int temp = 0;
        for(int i =0;i<arr.length;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
                else
                    continue;
            }
            temp = arr[i];
            arr[i]= arr[min];
            arr[min]=temp;
        }
        String result = Arrays.toString(arr);
        System.out.println(result);
    }
}
