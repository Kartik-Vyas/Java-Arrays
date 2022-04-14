package vyas.Arrays;
import java.util.*;
public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of array you want:-");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[n];
        arr1[0] = arr[0];
        System.out.println(arr1[0]);
        for(int i =1;i<arr1.length;i++)
        {
            arr1[i]= arr[i] + arr1[i-1];
            System.out.println(arr1[i]);
        }
        System.out.println(Arrays.toString(arr1));
    }
}
