/*
Given two sorted arrays, merge them such that the elements are not repeated

Eg 1: Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 
8
10
2 4 5 6 7 9 10 13
2 3 4 5 6 7 8 9 11 15
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		int[] arr3 = new int[n+m];
		
		int a = 0;
		for(int i=0;i<n;i++)
		{
			arr1[i]= sc.nextInt();
			arr3[a]=arr1[i];
			a++;
		}
		
		for(int j=0;j<m;j++)
		{
			arr2[j] = sc.nextInt();
			arr3[a]=arr2[j];
			a++;
		}
		
		Arrays.sort(arr3);		
		
		System.out.print(arr3[0]);
		int b = arr3[0];
		
		for(int i=1;i<n+m;i++) {
			if(b!=arr3[i]) {
				System.out.print(" "+arr3[i]);
				b=arr3[i];
			}
			else {
				b=arr3[i];
			}
		}
	}
}
