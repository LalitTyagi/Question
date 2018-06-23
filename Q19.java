/*
Find if the matrix is available after the rotation.
*/

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=0,d=0;

		int[][] arr1 = new int[n][n];
		int[][] arr2 = new int[n][n];
		int[][] temp = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		for(int k=0;k<3;k++) {
			c=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					temp[i][j]=arr1[n-j-1][i];
				}
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr1[i][j]=temp[i][j];
				}
			}
			
			outerloop:
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(arr1[i][j]==arr2[i][j]) {
						c++;
					}
					else {
						break outerloop;
					}
				}
			}
			
			if(c == n*n)
				break;
			
			d++;
		}
		
		if(c == n*n) {
			System.out.println("True");
			if(d==0) {
				System.out.println("90");
			}
			else if(d==1)
			{
				System.out.println("180");
			}
			else if(d==2) {
				System.out.println("270");
			}			
		}
		else {
			System.out.println("False");
		}
	}
}
