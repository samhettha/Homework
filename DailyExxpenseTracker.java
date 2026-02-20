import java.util.Scanner;

class DailyExpenseTracker 
{
    static final int MAX = 100;
    static float[] expenses = new float[MAX];
    static int count = 0;

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Daily Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Calculate Total Expense");
            System.out.println("4. Find Highest Expense");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
			{
                case 1: addExpense(sc); break;
                case 2: viewExpenses(); break;
                case 3: calculateTotal(); break;
                case 4: findHighest(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while(choice != 5);

        sc.close();
    }

    static void addExpense(Scanner sc)
	{
        if(count < MAX) 
		{
            System.out.print("Enter expense amount: ");
            expenses[count] = sc.nextFloat();
            count++;
        } 
		else
			{
            System.out.println("Expense list full!");
        }
    }

    static void viewExpenses() 
	{
        System.out.println("\nExpenses:");
        for(int i = 0; i < count; i++) 
		{
            System.out.println("Expense " + (i+1) + ": " + expenses[i]);
        }
    }

    static void calculateTotal()
	{
        float total = 0;
        for(int i = 0; i < count; i++)
			{
            total += expenses[i];
        }
        System.out.println("Total Expense: " + total);
    }

    static void findHighest() 
	{
        if(count == 0) 
		{
            System.out.println("No expenses recorded.");
            return;
        }
        float highest = expenses[0];
        for(int i = 1; i < count; i++)
			{
            if(expenses[i] > highest)
				{
                highest = expenses[i];
            }
        }
        System.out.println("Highest Expense: " + highest);
    }
}