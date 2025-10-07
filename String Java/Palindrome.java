import java.util.*;
class Palindrome {
    public static void isPalindrome(String str){
        boolean check=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt((str.length()-1-i))){
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("Palindrome....");
        }
        else{
            System.out.println("NOT Palindrome (X)........");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String for Palindrome check: ");
        String str=sc.nextLine();
        isPalindrome(str);
        sc.close();
    }
}
