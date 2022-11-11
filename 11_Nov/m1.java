import java.util.Scanner;

public class m1{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();
        int five = sc.nextInt();
        int six = sc.nextInt();
        
        int val=one+(two*2)+(five*2)+(six*2)+(three*3)+(four*3);
        System.out.println(val);
    }
}
