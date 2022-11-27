

import java.util.*;

public class RotedReturnBack{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        
        for(int i=0;i<tc;i++){
            int n= sc.nextInt();
            int k= sc.nextInt();
            sc.nextLine();
            int [] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            find(arr,n,k);
             System.out.println();
        }
    }
    
    public static void find(int [] arr, int n, int k){
        k=k%n;
        
        for(int i=(n-k); i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        for(int i=0; i<(n-k);i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
