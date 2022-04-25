import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = new int[nums.length];
        for(int i = 0;i<nums.length;i++)
        {
            for(int j=index[i];j<index.length;j++)
            {
                target[j] = nums[i];
                break;
            }
        }
        String result = Arrays.toString(target);
        System.out.println(result);
    }
}
