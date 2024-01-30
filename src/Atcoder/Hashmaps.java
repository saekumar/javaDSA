package Atcoder;
import java.util.*;
public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		HashMap<String,Integer> hash=new HashMap<>();
		hash.put("tourist",3858);
		hash.put("ksun48",3679);
		hash.put("Benq",3658);
		hash.put("Um_nik",3648);
		hash.put("apiad",3638);
		hash.put("Stonefeang",3630);
		hash.put("ecnerwala",3613);
		hash.put("mnbvmar",3555);
		hash.put("newbiedmy",3516);
		hash.put("semiexp",3481);
		String s=sc.next();
		if(hash.containsKey(s))
		{
			System.out.println(hash.get(s));
		}

	}

}
