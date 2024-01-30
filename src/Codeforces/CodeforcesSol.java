package Codeforces;

import java.util.*;
public class CodeforcesSol{
      public static void main(String args[])
      {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                  int n=sc.nextInt();
                  int arr[]=new int[n];
                  for(int i=0;i<n;i++)
                  {
                        arr[i]=sc.nextInt();
                        
                  }
                  Arrays.sort(arr);
                  int fi=0;
                  int la=n-1;
                  int ha=n/2;
                  int an=0;
                  while(ha>0)
                  {
                       int le=arr[fi];
                       int ri=arr[la];
                       int df=ri-le;
                       an+=df;
                       ha--;
                       fi++;
                       la--;
                  }
                  System.out.println(an);
                 
            }
      }
}
