import java.util.*;

public class sumOfAllElem{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enetr a number..");

        int n=sc.nextInt();




















        
        sc.nextLine();

        int arr[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum=0;
        for(int a:arr)sum+=a;

        System.out.println(sum);
    }
}