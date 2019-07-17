import java.util.Scanner;
class Main {
	public static void main (String args[]) 
    {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int j=n%100;
      int k=j/10;
      System.out.println(k);
	}
}