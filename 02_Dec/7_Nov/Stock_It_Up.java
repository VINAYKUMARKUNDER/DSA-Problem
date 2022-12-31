import java.util.Arrays;
import java.util.Scanner;


public class Stock_It_Up {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.nextLine();
        
        int arr []= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        
        int gross[]={550,240,84,159,80,160,252};
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                //  System.out.println(arr[i]+" "+gross[i]);
                sum+=gross[i];
            }
        }
        
            System.out.println(sum*n);
    
    }
}
