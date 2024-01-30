//https://www.codechef.com/START76D/problems/REDSTRBTN
package Leetcodesums;
import java.util.*;
public class Codechef3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int c=0;
			int arr[]=new int[3];
			for (int i = 0; i < 3; i++) {
				arr[i]=sc.nextInt();
				
			}
			Arrays.sort(arr);
			for (int i = 0; i < 2; i++) {
				if(arr[i]==1)
				{
					if(arr[i+1]==1)
					{
						if(arr[i+2]<=3)
						{
							c=1;
							break;
						}
					}
					else if(arr[i+1]==2 && arr[i+2]==2 )
					{
					    c=1;
					    break;
					}
					else if(arr[i+1]==3 && arr[i+2]==3)
					{
					    c=1;
					    break;
					}
				}
				
			}
			if(c==1)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}

	}

}
