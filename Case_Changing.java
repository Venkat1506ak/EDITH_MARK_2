import java.util.*;

class Case_Changing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sam;
        
        System.out.print("Enter the String:");
        sam=sc.nextLine();
        StringBuffer s = new StringBuffer(sam);
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)>=65 && s.charAt(i)<=92){
                s.setCharAt(i,(char)((int)s.charAt(i)+32));
            }else{
                s.setCharAt(i,(char)((int)s.charAt(i)-32));
            }
        }
        System.out.print(s);
    }
}