import java.util.Scanner;

public class Pattern_of_N {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printTable(n);
    }
    
    public static void printTable(int n){
        
        int x=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
    }
    
}
