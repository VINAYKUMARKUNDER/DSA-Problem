import java.util.Scanner;

public class Prime_Sum_Up {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int sum=0;
        
        for(int i=1;i<=n;i++){
            
            if(prime(i))sum+=i;
        }
        
        System.out.println(sum);
    }
    
    public static boolean prime(int n){
        
        int count=0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0)count++;
        }
        
        if(count==2)return true;
        return false;
        
    }
}
