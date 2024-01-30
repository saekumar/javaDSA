package CRT;
import java.util.*;

public class Crt8Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no_bags=100;
		while(no_bags>0)
		{
			int coll=sc.nextInt();
			no_bags-=coll;
		}
		System.out.println("REMAINING BAGS ARE :"+no_bags);

	}

}
