

import java.util.*;

public class MakeA_WayOFArray{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        sc.nextLine();
        int [] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        
        Arrays.sort(arr);
        
        
        for(int i=1;i<n;i+=2){
            
            int temp = arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        
        for(int a:arr)System.out.print(a+" ");
    }
}
