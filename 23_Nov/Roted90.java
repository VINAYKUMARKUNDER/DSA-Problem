

import java.util.*;

public class Roted90{
    
    static int [][]matrix;
    static int R = 4;
    static int C = 4;
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        matrix=new int[n][n];
        sc.nextLine();
        
        for(int i=0;i<n;i++){
            int [] arr=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }
        
       int [][] ans= roted(matrix,n);
        
        for(int a[]:ans){
            for(int b:a)System.out.print(b+" ");
            System.out.println();
        }
    }
    
    public static int [][] roted(int [][]mat,int n){
        
        int [][] ans = new int[n][n];
        int x=0;
        for(int i=n-1;i>=0;i--){
            int y=0;
            for(int j=0;j<n;j++){
                ans[x][y++]=mat[j][i];
            }
            x++;
        }
    return ans;
            
    }
}
