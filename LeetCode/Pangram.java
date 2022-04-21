import java.util.Scanner;

public class Pangram
{
 public static void main(String[] args)
  {
   Scanner sc = new Scanner (System.in)
   String input = sc.nextLine();
   int[] arr  = new int[127]; 
   int flag =0;
   for(int i=0;i<input.length();i++)
    {
     arr[input.charAt(i)] = arr[input.charAt(i)] +1;
    }
    for(int i=97;i<=122;i++)
     {
      if((arr.charAt(i)==0) || (arr.charAt(i)>1))
      {
       flag =1;
      }
      else
      continue;
    }
    if(flag ==1)
    {
     System.out.println("false");
    }
     else
     System.out.println("true");
       
     
    
