class MixedOperators
{
  public static void main(String[] args)
  { 
   int a = 10;
   int b= 5;
   int c= 15;
   
   boolean d = (a<=c)&&(5>10);
   boolean e =!((c<=b)||!(a>=b));
   
   System.out.println(d);
   System.out.println(e); 
  
   }

}