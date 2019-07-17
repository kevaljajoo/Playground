import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int index = 0; index <= n - 1; index++){
            arr[index] = sc.nextInt();
        }
        int k = sc.nextInt();
        selection_sort(n, arr);
        System.out.println(arr[n-k]);
    }
    public static void selection_sort(int n, int arr[]){
        for(int start_index = 0; start_index <= n - 2; start_index++)
        {
            int min_index = find_minimun_index(start_index, arr, n-1);
            swap(start_index, min_index, arr);
        }
    }
     public static void swap(int start_index, int min_index, int arr[]){
         int temp = arr[start_index];
         arr[start_index] = arr[min_index];
         arr[min_index] = temp;
     }
     public static int find_minimun_index(int start_index, int arr[], int end_index){
         int min_index = 0;
         if(arr[start_index] < arr[start_index + 1])
         {
             min_index = start_index;
         }
         else{
             min_index = start_index + 1;
         }
         for(int i = start_index + 2; i <= end_index; i++){
             if(arr[min_index] > arr[i])
             {
                 min_index = i;
             }
         }
         return min_index;
     }
}