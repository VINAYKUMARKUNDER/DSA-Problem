

import java.util.*;

public class Spring{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int tc= sc.nextInt();
        
        for(int i=0;i<tc;i++){
            int n= sc.nextInt();
            String s= sc.next();
            
            comprose(n,s);
        }
    }
    
    public static void comprose(int n, String s){
        char ch[]= s.toCharArray();
        
        int count=0;
        
        String ans="";
        char track=ch[0];
        
        for(int i=0;i<n;i++){
            
            if(ch[i]==track){
                count++;
            }else{
                ans+=ch[i-1];
                ans+=count;
                track=ch[i];
                count=1;
            }
        }
        ans+=ch[n-1];
         ans+=count;
        
        System.out.println(ans);
    }
}
