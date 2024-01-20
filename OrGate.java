
package dm;

import java.util.Scanner.*;

public class OrGate {

    
    public static void main(String[] args) 
    {
       
      int A[]= new int[]{0,0,1,1};
      int B[]=new int[]{0,1,0,1};
      int ans;
      
      System.out.println("Or Gate");
     for(int i = 0;i<=3;i++)
     {
         if (A[i] + B[i] > 0)
            ans = 1;
        else
            ans = 0;
         System.out.println(" "+A[i]+" "+B[i]+" = "+ans);
     }
     
      
      
    }
    
}
