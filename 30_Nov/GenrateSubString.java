
import java.util.*;

public class GenrateSubString{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        for(int i=0;i<tc;i++){
            int n= sc.nextInt();
            String str=sc.next();
            
            subString(n,str);
        }
    }
    
    public static void subString(int n, String s){
        char [] ch=s.toCharArray();
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                
                for(int k=i;k<=j;k++){
                    System.out.print(ch[k]);
                }
                System.out.println();
            }
        }
    }
}
