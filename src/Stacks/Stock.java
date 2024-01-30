package Stacks;

import java.util.*;

class Stock {

    static void stockSpan(int[] arr, int size) {

        for (int i = size-1; i >= 0; i--)
        {
            int curr_span = 0;
            for (int j = i ; j >= 0; j--)
            {
            	if(arr[j]<=arr[i])
            	{
            		curr_span++;
            		
            	}
            }
            System.out.print(curr_span + " ");
        }

    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = {12, 14, 15, 7, 15, 17, 5};
        int size = arr.length;
        stockSpan(arr, size);

    }
}
