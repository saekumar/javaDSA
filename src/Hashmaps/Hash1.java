package Hashmaps;
//Given an integer array of size n, find all elements that appear more than [n/3] times..
import java.util.*;
public class Hash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> sai =new HashMap<>();
		sai.put(1,"Saikumar");
        sai.put(2, "Kiran");
        System.out.println(sai);
		for(Map.Entry e:sai.entrySet()) {
		System.out.println(e.getKey()+" "+e.getValue());
	}


}
	}
