package vyas.LeetCode;
import java.util.Arrays;
public class GreatestNoOfCandiesEffective {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        boolean [] result = new boolean[candies.length];

        for(int i=0;i< candies.length;i++)
        {
          int x  = candies[i] + 3;
          int flag = 0;
            for(int j= 0;j<candies.length;j++)
            {
                if(candies[j]<=x)
                {
                 flag = 1;
                }
                else
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                result[i] = true;
            }
            else{
                result[i] = false;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
