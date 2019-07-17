import java.util.Scanner; 
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int matrix[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        for(int i = row - 1; i >= 0; i--){
            for(int j = 0; j <= col - 1; j++){
               System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}