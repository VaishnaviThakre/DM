
package dm;

import java.util.Scanner.*;

public class implocation {

    
    public static void main(String[] args) 
    {
       
      int A[] = new int[]{0,0,1,1};
      int B[] = new int[]{0,1,0,1}; 
      
      int ans;
      
      System.out.println("Single Implication");
     for(int i = 0;i<=3;i++)
     {
         if (A[i]==1 && B[i]==0)
            ans = 0;
        else
            ans = 1;
         System.out.println(" "+A[i]+" "+B[i]+" = "+ans);
     }
     System.out.println("Double implication");
     for(int i = 0;i<=3;i++)
     {
         if (A[i]==B[i])
            ans = 1;
        else
            ans = 0;
         System.out.println(" "+A[i]+" "+B[i]+" = "+ans);
     }
     
      
      
    }
    
}
