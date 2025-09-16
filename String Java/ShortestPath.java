import java.util.Scanner;
class ShortestPath {
    public static float shortestPath(String str){
        int x=0, y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
            else{
                return -1;
            }
        }
        return (float)Math.sqrt(x*x + y*y);
}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the direction String (Combination of N, E, S, W) for Shortest Path: ");
        String path=sc.nextLine();

        float sp = shortestPath(path);
        if(sp==-1){
            System.out.println("Invalid Input!, Please enter valid direction String, and Retry.");
        }
        else{
            System.out.println("The shortest Path for teh Direction String is: "+sp);
        }
        sc.close();
    }
}
