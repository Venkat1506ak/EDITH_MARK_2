import java.util.*;

class Neon {
    public static void main(String[] args) {
        int n,m,sum=0;
        System.out.print("Neon Number\n");
        System.out.println("-----------");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        if(n%9==0){
            System.out.println(n+" is a Neon Number");
        }
        else{
            System.out.println(n+" is Not a Neon Number");
        }
        
    }
}