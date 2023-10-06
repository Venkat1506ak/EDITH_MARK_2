import java.util.*;


public class Mitsogo {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Chemical name:");
        String sam=sc.nextLine();
        int count=0,val=0;
        String[] sri=sam.split(" ");
        for(int i=0;i<sri.length-1;i++){
            StringBuffer s=new StringBuffer(sri[i]);
            for(int j=i+1;j<sri.length;j++){
                StringBuffer a=new StringBuffer(sri[j]);
                for(int k=0;k<s.length();k++){
                    for(int l=0;l<a.length();l++){
                        if(s.charAt(k)==a.charAt(l)){
                            k++;
                            val++;
                        }
                    }
                }
                if(val>=s.length() || val>=a.length()){
                    count++;
                }
                val=0;
            }
        }
        System.out.println("Explotions:"+count);
    }
    
}
