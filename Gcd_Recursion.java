import java.util.*;

class Gcd_Recursion {
    
    public static int sam(int n,int m){
        if(m==0){
            return n;
        }
        else{
            return sam(m,n%m);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int n=sc.nextInt();
        System.out.print("Enter the 2nd number:");
        int m=sc.nextInt();
        int a=sam(n,m);
        System.out.print("GCD : "+a);
        
    }
}