import java.util.Scanner;
class Main{
  public static int sum(int m)
  {
   int sum = 0;
    for (int i = m ; i >= 1 ; i--)
    {
      sum = sum + i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sod = sum(n);
      System.out.println(sod);
	}
}