package vyas.Arrays;

import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {

        int[] arr = {10,20,20,20,50,60,60,60,70,70,70};
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int lastIndex = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(element==arr[i])
            {
                System.out.println("first index is : "+i );
                for(int j=i;j<arr.length;j++)
                {
                 if(arr[j]==element)
                 {
                     lastIndex=j;
                 }
                 else
                 {
                     break;
                 }
                }
                break;
            }
        }
        System.out.println("the last index of element is : " + lastIndex);
    }
}
