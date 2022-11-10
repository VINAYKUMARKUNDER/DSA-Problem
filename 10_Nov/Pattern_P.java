import java.util.Scanner;

public class Pattern_P{
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        printStar(n);
    }
    
    public static void printStar(int n){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}