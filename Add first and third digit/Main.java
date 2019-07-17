import java.util.Scanner;
class Main{
	public static void main (String args[]) 
    {
		// Type your code here
      int j,i;
      Scanner in = new Scanner(System.in);
      i=in.nextInt();
      j=i/100;
      int k=i%10;
      int sum=j+k;
      System.out.println(sum);
	}
}