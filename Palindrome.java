import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        int j,i;
        boolean ispalin=true;
        Scanner sc=new Scanner(System.in);
        System.out.print("Palindrome\n");
        System.out.print("----------\n");
        String sam;
        System.out.print("Enter the string:");
        sam=sc.nextLine();
        j=sam.length()-1;
        for(i=0;i<sam.length()/2;i++){
            if(sam.charAt(i)!=sam.charAt(j)){
                ispalin=false;
                break;
            }
            j--;
        }
        if(ispalin==true){
            System.out.print(sam+" is a Palindrome");
        }else{
            System.out.print(sam+" is not a palindrome");
        }
    }
}