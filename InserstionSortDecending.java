
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={5,3,-1,2,1};
        for(int i=arr.length-1;i>0;i--){
            for(int j=i;j<arr.length;j++){
                if(arr[j-1]<arr[j]){
                    int temp=arr[j-a1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
