package vyas.Arrays;

public class CommonElementTwoUnqiueArrays {
    public static void main(String[] args) {

        int [] a ={4,3,9,7,2};
        int [] b = {5,1,4,8,3};
        for(int i =0; i<a.length; i++)
        {
            for(int j=0; j<b.length; j++)
            {
                if(a[i] == b[j])
                {
                    System.out.println(a[i]);
                    break;
                }
                else
                {
                    continue;
                }
            }
        }
    }
}
