//Fibanocci series

import java.util.*;


class Fibanocci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=-1,b=1;
        for(int i=0;i<n;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}