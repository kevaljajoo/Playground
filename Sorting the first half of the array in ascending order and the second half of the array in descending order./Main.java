import java.util.Scanner;
class Main
 {
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int list[] = new int[n];
         for(int index = 0;index < n; index++)
         {
             list[index] = sc.nextInt();   
         }
         insertion_sort(n,list);
     }
    public static void insertion_sort(int n,int list[])
    {
        for (int index1 = 1; index1 < n/2; index1++) 
        {
            int key = list[index1];
            int index2 = index1 - 1;
            while((index2 >= 0) && (list[index2] > key)) 
            {
                list[index2 + 1] = list[index2];
                index2--;
            }
            list[index2 + 1] = key;
        }
        for (int index1 = n/2; index1 < n; index1++) 
        {
            int key = list[index1];
            int index2 = index1 - 1;
            while((index2 >= n/2) && (list[index2] < key)) 
            {
                list[index2 + 1] = list[index2];
                index2--;
            }
            list[index2 + 1] = key;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(list[i]+" ");
        }
        
    }
}