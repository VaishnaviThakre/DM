
package dm;

import java.util.Scanner.*;

public class AndGate {

    
    public static void main(String[] args) 
    {
       
      int A[]= new int[]{0,0,1,1};
      int B[]=new int[]{0,1,0,1};
      int ans;
      
      System.out.println("And Gate");
     for(int i = 0;i<=3;i++)
     {
         ans = A[i]*B[i];
         System.out.println(" "+A[i]+" "+B[i]+" = "+ans);
     }
     
      
      
    }
    
}
