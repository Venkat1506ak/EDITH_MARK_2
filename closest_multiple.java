import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the divident");
		int x=sc.nextInt();
		System.out.print("Enter the divident");
		int y=sc.nextInt();//venkat
		int cl1=(x/y)*y;
		int cl2=cl1+y;
		if(x-cl1<cl2-x){
		    System.out.print(x-cl1);
		}else{
		    System.out.print(cl2);
		}
	}
}