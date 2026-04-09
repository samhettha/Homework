import java.util.Scanner;
public class JoinArray
{
 public static char[] join(char[]a,char[]b)
 {
   char[] result = new char[a.length+b.length];
   for(int i =0; i<a.length;i++)
   {
     result[i]=a[i];
   }
   for(int i=0;i<b.length;i++)
   {
   result[a.length+i]=b[i];
   }
   return result;
 }
  public static void main(String[]args)
  {
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter the first string");
   String s1=sc.next();
   System.out.print("Enter the second string");
   String s2=sc.next();
   
   char[] a =s1.toCharArray();
   char[] b = s2.toCharArray();
   char[] result=join(a,b);
   
   System.out.print("joined array: ");
   
   for(int i=0;i<result.length;i++)
   {
    System.out.print(result[i]);
   }
  }
}
