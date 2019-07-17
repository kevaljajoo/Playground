import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      int k = in.nextInt();
      System.out.println(gcd(n,m,k));
	}
  public static int gcd(int a, int b, int c)
  {
    int gcd = 0;
    if( a > b && a > c)
    {
      gcd = a;
    }
    else if(b > c && b > a)
    {
      gcd = b;
    }
    else
    {
      gcd = c;
    }
    return gcd;
  }
}