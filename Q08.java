/*

You’re given an array. Print the elements of the array which are greater than its previous elements in the array.
Input : 2 -3 -4 5 9 7 8    
Output: 5 9 8
You should solve this question in O(n) time.

*/

import java.util.*;

public class Q8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++){
		    if(arr[i]>arr[i-1]){
		        System.out.println(arr[i]);
		    }
		}
    }
}
