import java.util.*;

class Factorial_Recursion {
    
    public static int sam(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*sam(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int a=sam(n);
        System.out.print(a);
        
    }
}