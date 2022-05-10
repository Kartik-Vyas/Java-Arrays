package vyas.Arrays;

public class NonRepeatedElements {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,3,4,5};
      // using XOR <--------
        int x = arr[0];
        for(int i=1;i<arr.length; i++)
        {
            x = x^arr[i];
        }
        System.out.println("Non repeating element is : " + x);
    }
}
