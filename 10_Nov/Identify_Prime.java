import java.util.Scanner;

public class Identify_Prime {

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        
        if(prime(n))System.out.println("Yes");
        else System.out.println("No");
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
