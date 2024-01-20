
package dm;

import java.util.Scanner.*;

public class NotGate {

    
    public static void main(String[] args) 
    {
       
      int A[]= new int[]{0,1};
      
      int ans;
      
      System.out.println("Not Gate");
     for(int i = 0;i<=1;i++)
     {
         if (A[i] == 0)
            ans = 1;
        else
            ans = 0;
         System.out.println(" "+A[i]+" = "+ans);
     }
     
      
      
    }
    
}
