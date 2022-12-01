import java.util.Set;
import java.util.TreeSet;

public class Check {

    public static void main(String[] args) {
        Set<Character> set=new TreeSet();

        set.add('c');
        set.add('v');

        System.out.println(set);

        set.removeAll(set);
        System.out.println(set);
    }

    public int reverse(int x) {
        StringBuilder sb= new StringBuilder("");

        while(x>0){
            int val=x%10;
            x=x/10;

            String str=String.valueOf(val);
            sb.append(str);
        }

        Long ll=Long.parseLong(sb.toString());

        Integer i=Integer.MAX_VALUE;

        if(i<ll)return 0;
        else{
           
            return ll.intValue(); 
        }
        
    }
    
}
