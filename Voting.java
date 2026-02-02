 class Voting 
 {
    public static void main(String[] args)
	{
        int age = 20;
        boolean citizen = true;

        String result = (age >= 18 && citizen) ? "Eligible to Vote" : "Not Eligible to Vote";
        System.out.println(result);
    }
}