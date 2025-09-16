import java.util.*;
class SpiralMatrix {
    public static void displaySpiral(int arr[][]){
        int topRow=0;
        int bottomRow=arr.length-1;
        int leftColumn=0;
        int rightColumn=arr[0].length-1;
        while(topRow<=bottomRow && leftColumn<=rightColumn){
            for(int j=leftColumn;j<=rightColumn;j++){
                System.out.print(arr[topRow][j]+" ");
            }
            for(int i=topRow+1;i<=bottomRow;i++){
                System.out.print(arr[i][rightColumn]+" ");
            }
            for(int j=rightColumn-1;j>=leftColumn;j--){
                System.out.print(arr[bottomRow][j]+" ");
            }
            for(int i=bottomRow-1;i>=topRow+1;i--){
                System.out.print(arr[i][leftColumn]+" ");
            }
            topRow++;
            bottomRow--;
            leftColumn++;
            rightColumn--;
        }
    }
    public static void displayMatrix(int arr[][]){
        System.out.println("Displaying the Matrix.......");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of matrix (rows and columns): ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];
        System.out.println("Enter the elemnts of the matrix: ");
        for(int i=0;i<rows;i++){
            System.out.println(("Enter the values in row-"+i+": "));
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        displayMatrix(matrix);
        displaySpiral(matrix);
        sc.close();
    }
}
