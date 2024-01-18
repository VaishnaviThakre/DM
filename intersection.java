import java.util.*;

public class intersection {
   
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
       
        int ele;

        //reading values of sets from the user
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

        //checking intersection
        HashSet<Integer> I = new HashSet<>(A);
        //reatin all method keep only those elements which are previously present in the collection and removes others.
        I.retainAll(B);

        System.out.println("Intersection set is: " + I);
        sc.close();
    }
}
