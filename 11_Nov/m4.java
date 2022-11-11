import java.util.Scanner;

public class m4{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int m= sc.nextInt();
        int count=0;
        
        for(int i=0;i<n*m;i++){
            if(!prime(sc.nextInt()))count++;
        }
        System.out.println(count);
    }
    
    public static boolean prime(int n){
        int count=0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0)count++;
        }
        if(count==2)return true;
        else return false;
    }
}