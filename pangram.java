import java.util.*;
public class pangram {
    public static void main(String[] args) {
        int count=1;
        String str="Mr. Jock, TV quiz Ph.D., bags few lynx.";
        char[] ch1=new char[26];
       char[] ch=str.toCharArray();
       int k=0;
       Arrays.sort(ch);
       for(int i=0;i<ch.length;i++){
           if(ch[i]>=65  && ch[i]<=123){
               ch1[k++]=ch[i];
           }
       }
       for(int i=0;i<ch1.length-1;i++)
        {
            
            if(ch1[i]==ch1[i+1]){
                break;
            }
            else{
                count++;
            }
        }
        //System.out.print(count);
        if(count==26){
            System.out.println("tanagram");
        }
       
        for(int i=0;i<ch1.length;i++)
        {
            
        System.out.print(ch1[i]);
        }
    }
}