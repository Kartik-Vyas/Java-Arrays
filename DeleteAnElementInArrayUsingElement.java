package vyas.Arrays;

import java.util.Arrays;

public class DeleteAnElementInArrayUsingElement {
    public static void main(String[] args) {
        int[] arr = {5,7,13,28,57,67};
        int element = 5;
        int flag=0;

        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] >=element)
            {
                flag = 1;
                arr[i] = arr[i+1];
                System.out.print(arr[i] + " ");
            }
            else
            {
                System.out.print(arr[i] + " ");
                continue;
            }
        }
        if(flag==1)
        {
            System.out.println();
            System.out.println("The given element is deleted from your array");
        }
        else
        {
            System.out.println();
            System.out.println("The given element is not present in your array");
        }
    }
}
