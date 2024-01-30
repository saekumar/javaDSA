package PriorityQueues;

import java.util.*;

public class Min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		PriorityQueue<Integer> rightmin=new PriorityQueue<>();
		PriorityQueue<Integer> leftmx=new PriorityQueue<>(Collections.reverseOrder());
		double cm=0.00;
		for(int x:ar)
		{
			if(x<cm)
			{
				if(leftmx.size()>rightmin.size())
				{
					int c=leftmx.remove();
					rightmin.add(c);
				}
				leftmx.add(x);
			}
			else {
				if(rightmin.size()>leftmx.size())
				{
					int c=rightmin.remove();
					leftmx.add(c);
				}
				rightmin.add(x);
			}
			if(leftmx.size()>rightmin.size())
			{
				cm=leftmx.peek();
			}
			else if(rightmin.size()>leftmx.size())
			{
				cm=rightmin.peek();
			}
			else
			{
				cm=((leftmx.peek()+rightmin.peek())/2.0);
			}
			System.out.println(cm);
			
		}
		
				

	}

}
