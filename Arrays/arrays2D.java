import java.util.Scanner;

public class arrays2D {

//Printing Spriral Matrix
    public static void printSprial(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endRow = matrix.length -1;
        int endCol = matrix[0].length -1;
    
    while(startrow <= endRow && startrow <= endCol){
        //top
        for(int i = startcol; i <= endCol; i++){
            System.out.println(matrix[startrow][i]);
        }
        //right
        for(int j = startrow +1 ; j <= endRow; j++){
            System.out.println(matrix[j][endCol]);
        }
        //bottom
        for(int i = endCol-1; i >= startcol; i--){
            if(startrow == endRow){
                break;
            }
            System.out.println(matrix[endCol][i] + " ");
        }
        //left
        for(int i = endRow -1 ; i >= startrow +1; i--){
            if(startcol == endCol){
                break;
            }
            System.out.println(matrix[i][startcol]);
        }
        startcol++;
        startrow++;
        endCol--;
        endRow--;
    }
}
//Search in Sprial Matrix
    public static boolean search(int matrix[][],int key ) {
        
        for(int i=0; i< matrix.length ;i++){
            for(int j = 0; j < matrix[0].length ; j++){
                if ( matrix[i][j]  == key ){
                    System.out.println(" found at cell("+ i + ","+ j);
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
// Diagonal Sum Of (m==n)Matrix    

    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        for(int i = 0; matrix.length > i; i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i != matrix.length -1 - i){
                sum += matrix[i][matrix.length -1 -i];
            }
        }
        return sum;
    }

    public static void Total7s(int matrix[][]){
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j <matrix.length; j++){
                if(matrix[i][j] == 7 ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    //transpose matrix
    public static void Transpose(int matrix[][]){
        int row = 3;
        int col = 2;
        int trans[][] = new int[col][row];

        for(int i = 0; i < row ; i++){
            for(int j =0; j< col; j++){
                matrix[row][col] = trans[col][row];
            }
        }
    }

    public static void RowSum(int matrix[][]){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j <matrix.length; j++){
                if(i == 1 ){
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
   
    public static void main(String args[]) {
        int matrix [][] = new int[3][2];
        int n=3,m=2;
        Scanner scn = new Scanner(System.in);
        //Input
        for(int i=0; i<n;i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = scn.nextInt();
            }
        }
        for(int i =0; i <n;i++){
            for(int j=0; j<m;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        Transpose(matrix);
        // RowSum(matrix);
        // Total7s(matrix);
        // System.out.println(diagonalSum(matrix));
        
        // printSprial(matrix);
        // search(matrix, 5);


         
        
    }
    
}
