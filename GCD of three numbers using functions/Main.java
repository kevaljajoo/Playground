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
    int min , gcd = 0;
    if( a < b && a < c)
    {
      min = a;
    }
    else if(b <c && b <a)
    {
      min = b;
    }
    else
    {
      min = c;
    }
    while(min>=1)
    {
      if((a % min == 0) && (b % min == 0) && (c % min == 0))
      {
        gcd = min;
        break;
      }
      min--;
    }
    return gcd;
  }
}