
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

class union{
    public static void main(String[] args) {
        int ele; 
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        HashSet<Integer> D = new HashSet<>();
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter set size: ");
        int size = sc.nextInt();
        for (int j = 0; j < 2; j++)
            for (int i = 0; i < size; i++){
               if (j == 0) {
                System.out.println("Enter A set element: ");
                ele = sc.nextInt();
                A.add(ele);
               } else {
                System.out.println("Enter B set element: ");
                ele = sc.nextInt();
                B.add(ele);
               }
           }


      System.out.println("\nAfter subtraction of two sets The diffrence is: \n");
      A.removeAll(B);
      System.out.println("A-B = "+B);
      B.removeAll(A);
      System.out.println("B-A = "+A);

      
    }
}