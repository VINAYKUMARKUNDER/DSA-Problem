
import java.util.*;

public class EqriemElem{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.nextLine();
        int [] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int ans= find(n,arr);
        System.out.println(ans);
    }
    
    public static int find(int n, int [] arr){
        int sum=0;
        for(int a:arr)sum+=a;
        
        int pos=0;
        for(int i=0;i<n;i++){
            if(pos==sum-arr[i])return i+1;
            else{
                pos+=arr[i];
                sum-=arr[i];
            }
        }
        return -1;
    }
}
