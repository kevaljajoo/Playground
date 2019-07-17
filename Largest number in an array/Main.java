import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index <= arr_size - 1; index++)
        {
            arr[index] = in.nextInt();
        }
        int max_no;
        if(arr[0] > arr[1])
        {
            max_no = arr[0];
        }
        else{
             max_no = arr[1];
        } 
        for(int index = 2; index <= arr_size - 1; index++)
        {
            if(max_no < arr[index])
            {
                max_no = arr[index];
            }
        }
        System.out.println(max_no);
    }
}