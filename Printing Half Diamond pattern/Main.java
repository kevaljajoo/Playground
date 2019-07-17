import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
	    for(int r= 1; r <= n; r++)
	    {
            // Handle space for each row
	        for(int space = 1; space <=  n - r; space++)
	        {
	            System.out.print(" ");
	        }
            // Handle stars for each row
	        for(int c = 1; c <= (2 * r - 1); c++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}