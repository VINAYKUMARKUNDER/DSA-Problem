import java.util.*;

public class Noddys_Examination{
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();


        int arr[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int count =0;
        int c=0;
        
        for(int a:arr){
            if(a<=k)count++;
            else c++;
            
            if(c==2)break;
        }
        System.out.println(count);
    }
}