package GoogleKickStart;
import java.util.*;
public class KickStart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
			
		}
		saraswathi(n,a);

	}
	static void saraswathi(int n,int a[])
	{
		HashMap<Integer, Integer> hm=new HashMap<>();
		int a2[]=new int[n-1];
		int c=0;
		for(int i=0;i<n-1;i++)
		{
			a2[c++]=a[i+1]-a[i];
		}
//		System.out.println(Arrays.toString(a2));
		for(int i=0;i<n-1;i++)
		{
			if(hm.containsKey(a2[i]))
			{
				hm.put(a2[i], hm.get(a2[i])+1);
			}
			else {
				hm.put(a2[i],1);
				
			}
		}
		for(Map.Entry<Integer, Integer> sa:hm.entrySet())
		{
			System.out.println(sa.getKey()+" "+sa.getValue());
		}
		 int max_value = (Collections.max(hm.values()));
		 System.out.println(max_value+1);
	}

}
