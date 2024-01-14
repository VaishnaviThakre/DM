
import java.io.*;
import java.util.*;

class cartisianPRoduct {

	static void Cartiesan(int arr1[], int arr2[], int n,
						int n1)
	{
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n1; j++)
				System.out.print("{" + arr1[i] + ", "
								+ arr2[j] + "}, ");
	}
	
	public static void main(String[] args)
	{
                Scanner sc = new Scanner(System.in);
                
                System.out.println("Enter the size of set: ");
		int n =sc.nextInt();
                
		int arr1[]=new int[n];
                int arr2[]= new int[n];

		
		System.out.println("Enter elements of 1st set");
                for(int i=0;i<n;i++){
                    arr1[i]=sc.nextInt();
                }
                System.out.println("Enter elements of 2nd set");
                for(int i=0;i<n;i++){
                    arr2[i]=sc.nextInt();
                }

		int n1 = arr1.length;
		int n2 = arr2.length;
		Cartiesan(arr1, arr2, n1, n2);
	}
}


;