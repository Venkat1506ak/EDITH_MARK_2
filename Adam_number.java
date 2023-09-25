import java.util.*;

class Adam {
    public static void main(String[] args) {
        int a,b,f,c,d=0,n,m,o=0;
        System.out.print("Adam Number\n");
        System.out.print("-----------\n");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        n=sc.nextInt();
        f=n;
        while(n!=0){
            m=n%10;
            o=o*10+m;
            n=n/10;
        }
        a=f*f;
        b=o*o;
        while(b!=0){
            c=b%10;
            d=d*10+c;
            b=b/10;
        }
        if(a==d){
            System.out.print("Adam Number");
        }
        else{
            System.out.print("Not Adam Number");
        }
        
    }
}