import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i = 0;
      int j , sum = 0;
      while(i < n)
      {
         j = n % 10;
         sum = sum + j;
        n = n / 10;
      }
       System.out.println(sum);
	}
}