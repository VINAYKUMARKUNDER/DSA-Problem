

public class PoossibleArray {
    public static void masaiPalindromicSubstring(String str){
        int n=str.length();
        int max=0;
        char ch [] =str.toCharArray();


        
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                
                String s="";
                for(int k=i;k<=j;k++){
                    s+=(ch[k]);
                }
                 boolean st= palindrome(s);
                 if(st){
                     int len = s.length();
                     max=Math.max(len,max);
                 }
            }
        }
        
        System.out.println(max);
      
    }
    
    public static boolean palindrome(String s){
        char ch[]=s.toCharArray();
        int n=ch.length;
        
        for(int i=0,j=n-1; i<n && j>=0; i++,j--){
            
            if(ch[i]!=ch[j])return false;
           
        }
        return true;
    }
    
}


