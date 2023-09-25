
import java.util.*;


class Amstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong Number");
        System.out.println("----------------");
       Scanner sc=new Scanner(System.in);
       int n,a,b,d,c=1,count=0,sum=0;
       
		n=sc.nextInt();
		a=d=n;
		while(n!=0){
		    count++;
		    n=n/10;
		}
		//System.out.println(count);
		while(a!=0){
		    b=a%10;
		    //System.out.println(b);
		    for(int i=0;i<count;i++){
		        c*=b;
		        //System.out.println(c);
		    }
		    sum=sum+c;
		    a=a/10;
		    c=1;
		}
		//System.out.println(sum);
		if(sum==d){
		    System.out.println("Amstrong Nummber");
		}
		else{
		    System.out.println("Not An Amstrong Number");
		}
    }
}
