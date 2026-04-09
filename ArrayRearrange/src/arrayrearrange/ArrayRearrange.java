package arrayrearrange;
public class ArrayRearrange 
{
    public static void rearrange(int[] arr)
      {
        int left = 0, right = arr.length - 1;

        while (left <= right) 
         {
            if (arr[left] < 0) 
            {
                left++;
            } 
        else if (arr[right] >= 0) 
            {
                right--;
            }
         else
            {
                // Swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
         }
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, -2, 3, -4, 5, -6};
        rearrange(arr);

        // Print result
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}