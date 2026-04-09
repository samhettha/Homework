import java.util.Scanner;

public class HalfSum {

    public static int sumHalf(int[] arr) {

        int sum = 0;
        int limit = (arr.length + 1) / 2;

        for (int i = 0; i < limit; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of half array: " + sumHalf(arr));
    }
}
