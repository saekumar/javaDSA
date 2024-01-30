package DsaPrograms;
import java.util.*;
public class MergingOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int arr1[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i]=sc.nextInt();
			
		}
		int arr2[]=new int[n];
		for (int i = 0; i < p; i++) {
			arr2[i]=sc.nextInt();
			
		}
		int[] a3=new int[n+p];
		
   sortedMerge(arr1,arr2,a3,n,p);
    System.out.println(Arrays.toString(sortedMerge(arr2, arr1, a3, n, p)));
	}
	 public static int[] sortedMerge(int a[], int b[],
             int res[], int n,
             int m)
{
// Concatenate two arrays
int i = 0, j = 0, k = 0;
while (i < n) {
res[k] = a[i];
i++;
k++;
}

while (j < m) {
res[k] = b[j];
j++;
k++;
}

// sorting the res array
Arrays.sort(res);
return res;
}
	 

}
