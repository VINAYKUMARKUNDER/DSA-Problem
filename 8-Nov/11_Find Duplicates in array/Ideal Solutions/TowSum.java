import java.util.*;

public class TowSum {
      
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            
            int tc=sc.nextInt();
            
            for(int i=0;i<tc;i++){

                int n=sc.nextInt();
                int k=sc.nextInt();
                
                sc.nextLine();
                
                int arr[]= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                
                List<Integer> ans=findSum(arr,n,k);
                
                System.out.println(ans.get(0)+" "+ans.get(1));
            }
        }
        
        static public List<Integer> findSum(int [] arr, int n, int k){
            List<Integer> list=new ArrayList<>();
            
            int start=0;
            int end=1;
            
            while(start<end && end<n){
                int sum=arr[start]+arr[end];
                
                if(sum==k){
                    list.add(start);
                    list.add(end);
                    break;
                }
                
                
                if(end==n-1){
                    start++;
                    end=start+1;
                    
                }
                else end++;
                
                
                
            }
            // Long sum=0l;

           
            







            
            if(list.size()==0){
                list.add(-1);
                list.add(-1);
                
            }
            
            return list;
        }
    
}
