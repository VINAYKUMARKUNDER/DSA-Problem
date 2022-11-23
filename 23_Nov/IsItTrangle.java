

import java.util.*;

public class IsItTrangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        
        for(int i=0;i<tc;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
          String ans=  find(a,b,c);
          System.out.println(ans);
        }
    }
    
    public static String find(int a, int b, int c){
        
        if((a+b)>c && (a+c)>b  && (b+c)>a)return "Yes";
        return "No";
    }
}
