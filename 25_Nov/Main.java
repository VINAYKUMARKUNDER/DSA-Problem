import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        for(int i=0;i<tc;i++){
            int n= sc.nextInt();
            sc.nextLine();
            int [] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            // Arrays.sort(arr);
            
            find(n,arr);
        }
    }
    
    public static void find(int n, int [] arr){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                
                
                int px1=arr[j];
                int px2=arr[j+1];
                
                if(px1<0)px1=px1*(-1);
                if(px2<0)px2=px2*(-1);
                
                double val3=Math.sqrt(px1);
                double val4=Math.sqrt(px2);
                
                int val1=(int) val3;
                int val2=(int) val4;
                
                // System.out.println(val1+" "+val2);
                
     
                if(val1>val2){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else if(val1==val2){
                    
                    if(arr[j]>arr[j+1]){
                         int temp=arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                    }
                }
                
            }
        }
        for(int a:arr)System.out.print(a+" ");
        System.out.println();
    }
}