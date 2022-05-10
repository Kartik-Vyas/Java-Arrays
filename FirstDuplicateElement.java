package vyas.Arrays;

public class FirstDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {5,3,4,3,2,2,1};
        int flag = 0;
        for(int i =0; i< arr.length;i++)
        {
            for(int j =i+1;j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                 flag = 1;
                 break;
                }
            }
            if(flag ==1)
            {
                System.out.println("First duplicate elements is : " + arr[i]);
                break;
            }
        }
    }
}
