package Hashmaps;
//https://www.mentorpick.com/code?cid=0bc10beb-5b20-4ab7-9ac2-3513a65c2eba&cslug=klu-y21-set-map&pid=ed432cad-8380-4ccf-943d-70ce96d6ccbf&pslug=TomRiddlesDiary&courseId=64bfd28d9c4b06352656f0bd&sectionId=undefined&type=courseV2
import java.util.*;
public class String_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<String,Integer> hash =new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			if(hash.containsKey(s))
			{
				System.out.println("YES");
				hash.put(s,hash.get(s)+1 );
			}
			else
			{
				System.out.println("NO");
				hash.put(s, 1);
			}
		}
		

	}

}
