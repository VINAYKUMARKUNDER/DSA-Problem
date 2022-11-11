import java.util.Scanner;

public class m3{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        
        for(int i=1;i<=n;i++){
            if(i%2==1){
                for(int j=0;j<n;j++)System.out.print("_");
            }else for(int j=0;j<n;j++)System.out.print("*");
            System.out.println();
        }
    }
}
