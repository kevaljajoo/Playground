import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int index = 0; index <= n - 1; index++){
            arr[index] = sc.nextInt();
        }
        int freq[] = new int[k];
        for(int i = 0; i <= k - 1; i++)
        {
            freq[i] = 0;
        }
        for(int index = 0; index <= n - 1; index++){
           freq[arr[index] - 1]++;
        }
        for(int index = 0; index <= k - 1; index++){
           System.out.println((index + 1) + " " + freq[index]);
        }
    }
}