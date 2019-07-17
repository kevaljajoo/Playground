import java.util.Scanner;
class Main{
  public static int power(int n, int m)
  {
    int mul = 1;
    for(int i = 1; i <= m ; i++)
    {
      mul = mul * n;
    }
    return mul ;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = power(a,b);
      System.out.println(c);
	}
}