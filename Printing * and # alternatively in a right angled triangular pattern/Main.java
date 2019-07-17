import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n = in.nextInt();
      int flag = 0 ;
      for(int i = 1 ; i <= n; i++)
      {
        for(int j = 1; j <= i ; j++)
        {
          if (flag == 0)
          {
            System.out.print("*");
            flag = 1;
          }
          else
          {
            System.out.print("#");
            flag = 0;
          }
        }
        System.out.print("\n");
      }
    }
}