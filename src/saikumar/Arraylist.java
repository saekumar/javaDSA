package saikumar;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> li=new ArrayList<>();
		for(int i=0;i<li.size();i++)
		{
			li.add(s.nextInt());
		}
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i)==67)
			{
				li.set(i, 96);
			}
		}
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}

	}

}
