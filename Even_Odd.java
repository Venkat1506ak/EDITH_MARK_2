
import java.util.*;


class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Even Or Odd Number");
        System.out.println("------------------");
       Scanner sc=new Scanner(System.in);
       int n;
		n=sc.nextInt();
		while(n>1 ){
			n=n-2;
		}
		if(n==0){
			System.out.println("Even Number");
		}
		else{
			System.out.println("Odd Number");
		}
    }
}
