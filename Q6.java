/*

4. Given an array of positive integers. The output should be the number of occurrences of each number.
Example:
Input: {2 3 2 6 1 6 2}
Output:
1 – 1
2 – 3
3 – 1
6 – 2

*/

import java.util.*;

public class Q6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]>max){
		        max=arr[i];
		    }
		}
		int[] tempArr = new int[max+1];
		
		for(int i=0;i<n;i++){
		    tempArr[arr[i]]++;
		}
		
		for(int i=0;i<n;i++){
		    if(tempArr[i]>0){
		        System.out.println(i+"->"+tempArr[i]);
		    }
		}
	}
}
