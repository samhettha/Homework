import java.util.Scanner;
 class TypeCastingMenu
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Type Casting Menu ---");
            System.out.println("1. int → double");
            System.out.println("2. double → int");
            System.out.println("3. char → int");
            System.out.println("4. int → char");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
			{
                case 1:
                    int i = 10;
                    double d = i; // implicit casting
                    System.out.println("int 10 → double: " + d);
                    break;
                case 2:
                    double d2 = 9.7;
                    int i2 = (int) d2; // explicit casting
                    System.out.println("double 9.7 → int: " + i2);
                    break;
                case 3:
                    char c = 'A';
                    int ci = c; // implicit casting
                    System.out.println("char 'A' → int: " + ci);
                    break;
                case 4:
                    int i3 = 66;
                    char c2 = (char) i3; // explicit casting
                    System.out.println("int 66 → char: " + c2);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while(choice != 5);

        sc.close();
    }
}
