import java.util.*;
class SearchSortedMatrix {
    public static void binarySearchRowwise(int matrix[][], int target){
        int row=-1, column=-1;
        for(int i=0;i<matrix.length;i++){
            int start=0, end=matrix.length-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(target==matrix[i][mid]){
                    row=i;
                    column=mid;
                    break;
                }
                else if(target<matrix[i][mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        if(row==-1 && column==-1){
            System.out.println("Element Not Found!");
        }
        else{
            System.out.println("Element Found at index: "+"("+row+", "+column+")");
        }
    }
    public static void searchBruteForce(int matrix[][],int target){
        int row=-1, column=-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    row=i;
                    column=j;
                    break;
                }
            }
        }
        if(row==-1 && column==-1){
            System.out.println("Element Not Found!");
        }
        else{
            System.out.println("Element Found at index: "+"("+row+", "+column+")");
        }
    }
    public static void displayMatrix(int matrix[][]){
        System.out.println("Displaying the Matrix........");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print(("Enter the number of row: "));
        int n=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Enter the elements of the Matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        displayMatrix(matrix);
        System.out.print("Enter the target element to be searched: ");
        int target=sc.nextInt();
        searchBruteForce(matrix,target);
        binarySearchRowwise(matrix,target);
        sc.close();
    }
}
