package Hashmaps;
import java.util.*;
public class IternaryOfTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] from= {"chennai","mumbai","goa","delhi"};
      String to[]= {"bengaluru","delhi","chennai","goa"};
      HashMap<String, String> FT=new HashMap<>();
      HashMap<String, String> TF=new HashMap<>();
      for (int i = 0; i < to.length; i++) {
    	  TF.put(to[i], from[i]);
    	  FT.put(from[i], to[i]);

		
	}
//      System.out.println(sai1);
//      System.out.println(sai2);
      String start="";
      for(String g:FT.keySet())
      {
    	  if(TF.containsKey(g)==false)
    	  {
    		   start=g;
    		  
    	  }
      }
      while(FT.containsKey(start))
      {
    	  System.out.print(start+"->");
    	  start=FT.get(start);
      }
      System.out.print(start);

	}

}
