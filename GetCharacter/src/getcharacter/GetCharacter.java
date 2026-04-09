
import java.util.Scanner;
public class GetCharacter 
{
    public static char getCharacterValue(char[] arr,int index)
    {
     return arr[index];
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a String:");
      String s = sc.next();
      
      System.out.print("Enter the index value:");
      int index=sc.nextInt();
      char[] arr = s.toCharArray();
       System.out.println(getCharacterValue(arr,index));
    } 
}


