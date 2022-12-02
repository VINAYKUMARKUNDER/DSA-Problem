import java.util.Arrays;
import java.util.Scanner;


public class PayForPhones {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int price[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int qui[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Long sum=0L;
        
        for(int i=0;i<price.length;i++){
            sum+=price[i]*qui[i];

        }
        
        if(sum<150000)System.out.print("Possible");
        else System.out.print("Not Possible");
        
    }
    
}
