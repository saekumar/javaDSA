package Hashmaps;

import java.util.*;
public class Hash2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Insert in hashmaps ==> (sai.put();)
		HashMap<String,Integer> sai=new HashMap<>();
		sai.put("India", 110);
		sai.put("USA", 30);
		System.out.println(sai );
		
		//SEARCH 
		if(sai.containsKey("USA"))
		{
			System.out.println(sai.get("USA"));
			
		}
		else
		{
			System.out.println("NO");
		}
		
		//ITERATION IN ARRAYS
		int arr[]= {1,2,5};
		for(int i=0;i<3;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		for(int i:arr) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		
		//ITERATION IN HASHMAP	
		//SYNTAX:
//		       Map.Entry<keyDataType,ValueDataType> s: sai.entrySet()

		for(Map.Entry<String,Integer> s:sai.entrySet())
		{
			System.out.println(s.getKey() + " " +s.getValue());
		}
//		ANOTHER METHOD
		Set<String> keys=sai.keySet();
		for(String i:keys)
		{
			System.out.println(i+" "+sai.get(i)); 
		}
		

	}

}
