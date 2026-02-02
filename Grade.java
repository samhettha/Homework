class Grade 
{
    public static void main(String[] args) 
	{
        int marks = 92;

        String grade = (marks >= 90) ? "Grade A" :
                       (marks >= 75) ? "Grade B" :
                       (marks >= 50) ? "Grade C" : "Fail";

        System.out.println(grade);
    }
}