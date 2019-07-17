import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int m = 1;
	    for(int r = 1; r <= n; r++)
	    {
            // Handle space for each row
	        for(int space = 1; space <= (n - r); space++){
	            System.out.print(" ");
	        }
            // Handle numbers for each row
	        for(int c = 1; c <= r; c++)
	        {
	            System.out.print(m + " ");
	            m++;
	        }
	        System.out.println();
	    }
	}
}