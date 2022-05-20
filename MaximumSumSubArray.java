package vyas;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {4,-2,-3,4,-1,-2,1,5,-3};
        int maxSumSoFar = Integer.MIN_VALUE; //7
        int maxValue = 0; //-1 /0
        int start = 0; //3
        int end = 0;//

        for(int i=0;i<arr.length;i++)
        {
            maxValue = maxValue + arr[i]; //4
            if(maxValue>maxSumSoFar)
            {
                maxSumSoFar=maxValue;
                start=start; //3
                end= i;  //7
            }
            if(maxValue<0)
            {
                maxValue=0;
                start=i+1; //3
            }
        }
        System.out.println("Maximum sum of sub array is : " + maxSumSoFar);
        System.out.println("The sub array is having starting index from " + start + " and ending with " + end);
    }
}
