package vyas.Arrays;

import java.util.Arrays;

public class InsertingElementIntoArray {
    public static void main(String[] args) {
        int [] arr = {5,8,20,23,37};
        int element = 18;
        int index = 2;

        if(index>=0 && index<arr.length)
        {
            for (int i = arr.length - 1; i >= index; i--) {
                if (i > index) {
                    arr[i] = arr[i - 1];
                } else {
                    arr[i] = element;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        else
        {
            System.out.println("Invalid input index");
        }
    }
}
