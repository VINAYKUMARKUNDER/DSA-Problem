import java.util.Scanner;

public class patrenPrinting {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        patternPrinting(n);
    }

    public static void patternPrinting(int n){
    
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if(i==0 || j==0 || j==n-1)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
      }
    
    
}
