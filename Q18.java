/*
Rotate nXn Matrix 90 degree,180 degree, 270 degree, 360 degree.
*/

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		m=m/90;
		int[][] arr = new int[n][n];
		int[][] temp = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int k=0;k<m;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
          //temp[i][j]=arr[n-j-1][i];//90 degree in lesft side
					temp[i][j]=arr[j][n-i-1];//90 degree in right side
				}
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=temp[i][j];
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(temp[i][j]);
			}
			System.out.print("\n");
		}

	}
}
