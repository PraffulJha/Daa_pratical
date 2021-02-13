import java.util.Scanner;
// program for linear search
public class linear_search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();

        int result = linearsearch(arr,k, n);
        if(result == -1)
        {
            System.out.println("ELement is not found");
        }
        else
        {
            System.out.print("Element is present at index " + result);
        }
    }
    public static int linearsearch(int[] arr, int k,int n)
    {

        for (int i = 0; i < n; i++)
        {
            if (arr[i] == k)
                return i;
        }
        return -1;
    }
}
