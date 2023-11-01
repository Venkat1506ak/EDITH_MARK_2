
import java.util.*;

public class pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the text");
        String s=sc.next();
        int n=s.length();
        int j=0,k=0;
        char[][] sam=new char[n][n];
        for(int i=0;i<n;i++){
            sam[j++][k++]=s.charAt(i);
            
            }
        int l=0;
        for(int i=0;i<n;i++){
            sam[--k][l++]=s.charAt(i);
            
            }
        for(int i=0;i<n;i++){
            for(int z=0;z<n;z++){
                System.out.print(sam[i][z]+" ");
            }
            System.out.println();
        }
    }
}

