package palin;
import static java.lang.Integer.toBinaryString;
import java.util.*;
public class binary {
    public static void main(String args[]){
        boolean naveen=true;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        int e=(int) Math.pow(2, n);
        for(int i=0;i<e;i++){
            String m=toBinaryString(i);
            String temp = new String("");

                // First logic
                // if(m.length() < n){
                //     for(int j= m.length(); j < n; j++){
                //         temp = temp + '0';
                //     }
                // }

                // Second logic
                // while(temp.length() < n - m.length()){
                //     temp = temp + '0';
                // }
            
            if(m.contains("11")){       
            }
            else{
                System.out.println(m);
            }   
        }
    }
}
