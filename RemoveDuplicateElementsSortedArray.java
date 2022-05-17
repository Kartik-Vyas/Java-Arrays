package vyas.Arrays;

public class RemoveDuplicateElementsSortedArray {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,5,5,6,6};

        for(int i=0; i<arr.length-1;i++)
        {
            if(arr[i+1]==arr[i])
            {
                continue;
            }
            else
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}
