

import java.util.*;

public class ElemInMiddle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.nextLine();
        int [] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int ans= find(n,arr);
        System.out.println(ans);
    }
    
    public static int find(int n,int [] arr){
        
        int track=arr[0];
        
        for(int i=0;i<n;i++){
            if(arr[i]>track){
                track=arr[i];
               if(isSafe(i,arr))return arr[i];
              
            }
        }
        return -1;
        
    }
    
    
    public static boolean isSafe(int i,int [] arr){
        
        for(int j=i;j<arr.length;j++){
            if(arr[i]>arr[j])return false;
        }
        return true;
    }
    
}
