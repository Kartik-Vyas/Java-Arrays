package vyas.Arrays;

import java.util.Arrays;

public class DeleteAnElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,7,13,28,57,67};
        int index = 3;

        if(index>=0 && index<arr.length)
        {
            for (int i = 0; i < arr.length-1; i++)
            {
                if (i >= index)
                {
                    arr[i] = arr[i + 1];
                    System.out.print(arr[i] + " ");
                }
                else
                {
                    System.out.print(arr[i] + " ");
                    continue;
                }
            }
        }
        else
        {
            System.out.println("Invalid index Number");
        }
    }
}
