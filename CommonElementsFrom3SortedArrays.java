package vyas.Arrays;

public class CommonElementsFrom3SortedArrays {
    public static void main(String[] args) {
        int[] a = {2,4,8};
        int[] b = {2,3,4,8,10,16};
        int[] c = {2,8,10,14};
        int x=0;
        int y=0;
        int z=0;
        while(x<a.length && y<b.length && z<c.length)
        {
            if(a[x]==b[y] && b[y]==c[z])
            {
                System.out.println(a[x]);
                x++;
                y++;
                z++;
            }
            else if(a[x]>b[y])
            {
                y++;
            }
            else if(b[y]> c[z])
            {
                z++;
            }
            else
            {
                x++;
            }
        }
    }
}
