

public class  Password{
    
}
/*
abstract class passwordDetector{
    abstract boolean checkLength(String password);
    abstract boolean checkSpecialCharacter(String password);
    abstract boolean checkNumber(String password);
    abstract boolean checkUpperCase(String password);
    abstract boolean checkLowerCase(String password);
}
*/
class checker extends Password{
    // complete the class as mentioned in the problem statement
    int size;
    
    public checker(int size) {
      this.size = size;
  }
    
    boolean checkLength(String password) {
      if(password.length()>=size) return true;
          return false;
      }
       
       
    boolean checkSpecialCharacter(String password){
        char ch[]=password.toCharArray();
        
        for(int i=0;i<password.length();i++){
            if(ch[i]=='@'||ch[i]=='$'||ch[i]=='#'||ch[i]=='&'||ch[i]=='*') return true;
        }
        return false;
      }
      
    boolean checkNumber(String password){
         char ch[]=password.toCharArray();
        
        for(int i=0;i<password.length();i++){
            if(ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9'||ch[i]=='0') return true;
        }
        return false;
    }
    
    boolean checkUpperCase(String password){
        char ch[]=password.toCharArray();
        
        for(int i=0;i<password.length();i++){
            if(Character.isUpperCase(ch[i])) return true;
        }
        return false;
        
    }
    
    boolean checkLowerCase(String password){
         char ch[]=password.toCharArray();
        
        for(int i=0;i<password.length();i++){
            if(Character.isLowerCase(ch[i])) return true;
        }
        return false;
    }
    
       
  }