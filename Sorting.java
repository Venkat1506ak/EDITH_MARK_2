import java.util.*;
class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n,temp;
        System.out.println("Sorting");
        System.out.println("-------");
        System.out.println("Enter the array size:");
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=1;i<=n;i++){
            System.out.print("Enter the "+i+" Element");
            arr[i-1]=sc.nextInt();
        }
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }
}