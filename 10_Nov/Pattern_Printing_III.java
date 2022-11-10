import java.util.Scanner;

public class Pattern_Printing_III {

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        printStar(n);
    }
    
    public static void printStar(int n){
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                
                if(i==n-1 || i==0 || j==n-1)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
