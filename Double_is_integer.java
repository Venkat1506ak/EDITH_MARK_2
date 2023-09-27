//Write a Java program to test if a double number is an integer

import java.util.*;

class Double_is_integer {
    public static void main(String[] args) {
        double a,b;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number:");
        a=s.nextDouble();
        b=Math.floor(a);
        if(a!=b){
            System.out.print("Not an Integer");
        }
        else{
            System.out.print("Integer");
        }
    }
}