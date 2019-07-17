import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int i=in.nextInt();
    int j=i/100;
    int k=((i%100)/10);
    int l=i%10;
    int sum=(l*100)+(k*10)+j;
    System.out.println(sum);
  }
}