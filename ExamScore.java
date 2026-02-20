import java.util.Scanner;

 class ExamScore
 {
    static final int MAX = 100;
    static final int PASS_MARK = 40;
    static int[] scores = new int[MAX];
    static int count = 0;

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;

        do
		{
            System.out.println("\n--- Exam Score Analyzer ---");
            System.out.println("1. Add Exam Score");
            System.out.println("2. Display All Scores");
            System.out.println("3. Count Pass Scores");
            System.out.println("4. Count Fail Scores");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
			{
                case 1: addScore(sc); break;
                case 2: displayScores(); break;
                case 3: countPass(); break;
                case 4: countFail(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while(choice != 5);

        sc.close();
    }

    static void addScore(Scanner sc) 
	{
        if(count < MAX)
			{
            System.out.print("Enter exam score: ");
            scores[count] = sc.nextInt();
            count++;
        } 
		else
			{
            System.out.println("Score list full!");
            }
    }

    static void displayScores()
	{
        System.out.println("\nScores:");
        for(int i = 0; i < count; i++)
			{
            System.out.println("Score " + (i+1) + ": " + scores[i]);
            }
    }

    static void countPass() 
	{
        int pass = 0;
        for(int i = 0; i < count; i++)
			{
            if(scores[i] >= PASS_MARK)
				{
                pass++;
                }
        }
        System.out.println("Number of Pass Scores: " + pass);
    }

    static void countFail() 
	{
        int fail = 0;
        for(int i = 0; i < count; i++)
			{
            if(scores[i] < PASS_MARK) 
			{
                fail++;
            }
        }
        System.out.println("Number of Fail Scores: " + fail);
    }
}