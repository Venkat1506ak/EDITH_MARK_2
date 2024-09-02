import java.util.*;

// reversing a given array for n nelements
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number:");
        int p=sc.nextInt();
        int n=0;
        while(n<size){
            int sam;
            if(n+p-1>=size){
                sam=size-1;
            }
            else{
            sam=n+p-1;
            }
            int sri=n;
            while(sri<sam){
                arr[sri]=arr[sri]+arr[sam];
                arr[sam]=arr[sri]-arr[sam];
                arr[sri]=arr[sri]-arr[sam];
                sri++;
                sam--;
            }
            n+=p;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}