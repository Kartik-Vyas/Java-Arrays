public class RichestCustomerWealth
  {
    public static void main(String[] args)
      {
        int [] nums = {{1,2,3},{3,2,1}};
        int max = 0;
        
        for(int i =0;i<nums length; i++)
          {
          int value =0;
            for(int j=0;j<nums[i].length; j++)
             {
              value+=nums[j];
             }
             if(max < value)
               {
               max = value;
               }
             else
               continue;
          }
        System.out.println(max);
      }
  }
