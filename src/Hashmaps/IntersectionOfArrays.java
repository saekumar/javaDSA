package Hashmaps;
import java.util.*;
public class IntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Scanner sc=new Scanner(System.in);
//    int c=0;
//    HashSet<Integer> sai=new HashSet<>();
//
//    int a=sc.nextInt();
//    int arr1[]=new int[a];
//    for (int i = 0; i < a; i++) {  
//		arr1[i]=sc.nextInt();
//		sai.add(arr1[i]);
//	}
//    int b=sc.nextInt();
//    int arr2[]=new int[a];
//    for (int j = 0; j < a; j++) {
//		arr2[j]=sc.nextInt();
//		if(sai.contains(arr2[j]))
//		{
//			c++;
//			sai.remove(arr2[j]);
//		}
//	}
    System.out.println(check());;
    
	}

	public  static int check() {
		// TODO Auto-generated method stub
		HashSet<Integer> se=new HashSet<>();
		int arr[]= {1,1,3,3,5,5};
		for(int i=0;i<6;i++)
		{
			
			se.add(arr[i]);
		}
		return se.size();
		
	}

}
