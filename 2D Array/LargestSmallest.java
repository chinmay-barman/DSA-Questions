import java.util.*;
class LargestSmallest{
    public static void displaylargest(int arr[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("The largest value in the matrix is: "+max);
    }
    public static void displaysmallest(int arr[][]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("The smallest value in the matrix is: "+min);
    }
    public static void displayMatrix(int arr[][]){
        System.out.println("Displaying the Matrix........");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int [3][3];
        int n=matrix.length;//No of rows
        int m=matrix[0].length;//No of columns
        for(int i=0;i<n;i++){
            System.out.println("Enter the values for row-"+i);
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        displayMatrix(matrix);
        displaylargest(matrix);
        displaysmallest(matrix);
        sc.close();
    }
}
