package vyas.Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsFromTwoArrays {
    public static void main(String[] args) {
        int [] a ={4,3,9,7,2,4,5};
        int [] b = {5,1,4,8,3,5,9};
        Set<Integer> arr1 = new HashSet<>();
        Set<Integer> arr2 = new HashSet<>();
        for(int num : a)
        {
            arr1.add(num);
        }
        for(int num : b)
        {
            arr2.add(num);
        }
        for(int num : arr2)
        {
            if(arr1.add(num)==false)
            {
                System.out.println(num);
            }
        }
     }
}
