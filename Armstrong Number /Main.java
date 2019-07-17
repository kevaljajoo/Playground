import java.util.Scanner;
class Main{
	public static void main (String args[]){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int c_number = number;
      int count=0;
      if(number == 0)
      {
      System.out.println(number);
      }
      else
      {
        while(number > 0)
        {
          count++;
          number = number / 10;
        }
      }
      number = c_number;
      int sum = 0;
      int pow = 1;
      while(number > 0)
      {
        int rem = number % 10;
        for(int c = 1 ; c <= count ; c++)
        {
          pow = pow * rem;
        }
        sum = sum + pow;
        pow = 1;
        number = number / 10;
      }
      if (sum != c_number)
      {
        System.out.println("Not a Armstrong Number");
      }
      else
      {
        System.out.println("Armstrong Number");
      }
	}
}