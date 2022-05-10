package vyas.Arrays;

public class DuplicateUsingArrays {
    public static void main(String[] args) {
        int[] arr = {3,5,4,3,2,2,1};
        //only applicable for 2 duplicate elements
        for(int i =0; i< arr.length;i++)
        {
            for(int j =i+1;j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
