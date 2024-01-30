package saikumar;
import java.util.*;

public class Count {

	public static void main(String[] args) {
		
		
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        for (int i = 0; i <s.length(); i++) {
        	int c=0;
        	
        	for (int j = i; j < s.length(); j++) {
        		
        		{
        			
        			if(s.charAt(i)==s.charAt(j) && s.charAt(j)!='0')
        			{
        				
        				c++;
        				
        				
        				
        				
        				
        			}
        			
        			
        		}
				
			}
        	System.out.println("Total no.of "+s.charAt(i)+"'s are "+c);
        
        	
        	
        	
			
		}
        
        System.out.println(s.toString());
        
        
      
        
	}

}
//saikumar
