import java.util.*;

public class Subtraction
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int count=0;
		System.out.println("Enter the First Number");
		int n=sc.nextInt();
		System.out.println("Enter the second Number");
		int m=sc.nextInt();
		if(n<m){
		    
		    for(int i=m;i>n;i--){
		        count++;
		    }
		    System.out.println("-"+count);
		
		}
		else{
		    
		    for(int i=m;i<n;i++){
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
      
