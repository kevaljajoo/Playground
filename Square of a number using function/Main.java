import java.util.Scanner;
class Main
{
  public static int square(int m)
  {
    int s;
    s= m * m;
    return s;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sq = square(n);
      System.out.println(sq);
	} 
}