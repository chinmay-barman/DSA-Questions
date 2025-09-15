import java.util.*;
class diagonalSum{
    public static void bruteForceDiagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("The Diagonal Sum through Brute Force for matrix is: "+sum);
    }
    public static void optimalDiagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("The Diagonal Sum through Optimal Approach for matrix is: "+sum);
    }
    public static void displayMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Matrix for Diagonal Sum: ");
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        System.out.println("Enter the values for the Matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        displayMatrix(matrix);
        bruteForceDiagonalSum(matrix);
        optimalDiagonalSum(matrix);
        sc.close();
    }
}
