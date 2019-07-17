import java.util.*;
class Main {
	public static void main (String args[]) 
    {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int i= in.nextInt();
      int j=i%10;
      int k=i/10;
      int sum=j+k;
	System.out.println(sum);
    }
}