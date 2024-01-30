package Codeforces;

import java.util.*;

public class SchrodingersSmileys {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t2=sc.nextInt();
		
		while(t2>0){
		    
		    int n=sc.nextInt();
		    String s=sc.next();
		    
		    List<Integer> ind=new ArrayList<>();
		    
		    for(int i=0;i<n;i++){
		        
		        if(s.charAt(i)==':')
		        ind.add(i);
		    }
		    
		    int ans=0;
		    for(int i=0;i<ind.size()-1;i++){
		        int startInd=ind.get(i);
		        int endInd=ind.get(i+1);
		        
		        int got=1;
		        startInd++;
		        int ins=0;
		        for(int j=startInd;j<endInd;j++){
		            if(s.charAt(j)!=')')
		            got=0;
		            ins=1;
		        }
		        if(got==1 && ins==1)
		        ans++;
		    }
		    System.out.println(ans);
		    t2--;
		}
	}
}
