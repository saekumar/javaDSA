package Hashmaps;
import java.util.*;
public class UnionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2 =sc.nextInt();
		HashSet<Integer> sai=new HashSet<>();
		int arr1[]=new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i]=sc.nextInt();
			sai.add(arr1[i]);
		
			
			
		}
		
		int arr2[]=new int[n2];
		for (int j = 0; j < n2; j++) {
			arr2[j]=sc.nextInt();
			sai.add(arr2[j]);
			
			
		}
		

		System.out.println(sai);
		

	}

}
