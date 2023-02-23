
import java.util.*;

public class RotedElem{
    
    static int [][]matrix;
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        matrix=new int[n][n];
        sc.nextLine();
        
        for(int i=0;i<n;i++){
            int [] arr=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }
        
        roted(matrix,n,n);
        
        for(int a[]:matrix){
            for(int b:a)System.out.print(b+" ");
            System.out.println();
        }
    }
    
    public static void roted(int [][]mat,int n,int m){
       
        int row = 0, col = 0;
        int prev, curr;
        
        
         while (row<m && col<n){
            if (row+1 == m || col + 1 == n)break;
                
            prev = mat[row + 1][col];
            for (int i = col; i < n; i++)
            {
                curr = mat[row][i];
                mat[row][i] = prev;
                prev = curr;
            }
            row++;

            for (int i = row; i < m; i++)
            {
                curr = mat[i][n-1];
                mat[i][n-1] = prev;
                prev = curr;
            }
            n--;

            {
                for (int i = n-1; i >= col; i--)
                {
                    curr = mat[m-1][i];
                    mat[m-1][i] = prev;
                    prev = curr;
                }
            }
            m--;

            {
                for (int i = m-1; i >= row; i--)
                {
                    curr = mat[i][col];
                    mat[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
        }
 
            
    }
 
    
}
