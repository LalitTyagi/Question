/*
Given an array, print all duplicate values. If no duplicates found print -1.

Input:12,13,14,12,125,24,24,12
Output:12,24  
Input:7,9,1,21 
Output:-1  
Input:32,6,12,45,12 
Output:12 
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int j=0;
		System.out.print("Output.:");
		for(int i=0;i<n-1;) {
			if(arr[i]==arr[i+1]) {
				System.out.print(arr[i]+" ");
				j=i+2;
				while(arr[i]==arr[j]) {
					j++;
				}
				i=j;
			}
			else
				i++;
		}
		if(j==0)
			System.out.print("-1");
	}
}
