import java.util.Scanner;
public class CheckCharacters
{
    public static boolean checker(char[] a,char[]b)
    {
     if(a.length !=b.length)
     {
      return false; 
     }
     for(int i=0;i<a.length;i++)
     {
      if(a[i]!=b[i])
      {
      return false;
      }
     } 
     return true;
    }
    
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first string");
      String s1=sc.next();
      System.out.println("Enter the second string");
      String s2=sc.next();
      
      char[] a= s1.toCharArray();
      char[] b=s2.toCharArray();
      
      if (checker(a,b))
      {
      System.out.println("Same");
     }
     else 
     {
      System.out.println("Not Same");
     }
    }
}
