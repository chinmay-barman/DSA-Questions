import java.util.*;
class Search2DMatrix {
    public static void optimal(int matrix[][], int target){
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=n-1;
        int row=-1, col=-1;
        while(i<m && j>=0){
            if(target==matrix[i][j]){
                row=i;
                col=j;
                break;
            }
            else if(target<matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        if(row!=-1 && col!=-1){
            System.out.println("(Optimal)The elemnt Found at index: "+"("+row+","+col+")");
        }
        else{
            System.out.println("Optimal)NOT Found!");
        }
    }
    public static void binarySearchImagine1DArrayForm(int matrix[][], int target){
        int m=matrix.length;
        int n=matrix[0].length;
        int start=0;
        int end=(m*n)-1;
        int row=-1, col=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==matrix[mid/n][mid%n]){
                row=mid/n;
                col=mid%n;
                break;
            }
            else if(target<matrix[mid/n][mid%n]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(row!=-1 && col!=-1){
            System.out.println("(1D Array imagine)The element Found at index: "+"("+row+","+col+")");
        }
        else{
            System.out.println("(1D Array Imagine)NOT Found!");
        }
    }
    public static void searchRowwiseBinarySearch(int matrix[][],int target){
        int m=matrix.length;
        int n=matrix[0].length;
        int row=-1, col=-1;
        for(int i=0;i<m;i++){
            int start=0;
            int end=n-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target==matrix[i][mid]){
                    row=i;
                    col=mid;
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
        if(row!=-1 && col!=-1){
            System.out.println("(Row wise Binary Search)The element is found at index: "+"("+row+","+col+")");
        }
        else{{
            System.out.println("(Row wise Binary Search)NOT Found!");
        }}
    }
    public static void searchBruteForce(int matrix[][],int target){
        boolean check=false;
        int row=-1,col=-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    check=true;
                    row=i;
                    col=j;
                    break;
                }
            }
        }
        if(check){
            System.out.println("(Brute Force)The element found at index:"+"("+row+","+col+")");
        }
        else{
            System.out.println("(Brute Force)NOT Found!");
        }
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int m=sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        System.out.println("Enter the elemnts of the matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        displayMatrix(matrix);
        searchBruteForce(matrix,5);
        searchRowwiseBinarySearch(matrix,5);
        binarySearchImagine1DArrayForm(matrix,5);
        optimal(matrix,5);
        sc.close();
    }
}
