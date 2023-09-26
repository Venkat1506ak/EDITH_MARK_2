import java.util.*;


class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        boolean isprime=true;
        System.out.print("Enter the Number:");
        n=sc.nextInt();
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime==true){
            System.out.print(n+" is a Prime Number");
        }else{
            System.out.print(n+" is Not a Prime Number");
        }
        
    }
}