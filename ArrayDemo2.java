package vyas.Arrays;
import java.util.Scanner;
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        int[] result = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            int sum1 = 0;
            for(int j=0;j<arr[i].length;j++)
            {
                sum1 = arr[i][j] + sum1;
            }
            result[i] = sum1;
        }
        int max=0;
        for(int i =0;i<result.length;i++)
        {
            if(max< result[i])
            {
                max = result[i];
            }
        }
        System.out.println(max);
    }
}
