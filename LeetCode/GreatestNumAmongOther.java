package vyas.LeetCode;
import java.util.Arrays;
public class GreatestNumAmongOther {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        //output [4,0,1,1,3]
        int [] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++)
        {
            for(int j =0; j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    continue;
                }
                else if(nums[i]> nums[j])
                {
                    result[i] = result[i]+1;
                }
            }
        }
        String value = Arrays.toString(result);
        System.out.println(value);
    }
}
