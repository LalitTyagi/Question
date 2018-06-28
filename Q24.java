/*
Given bigger NxN matrix and a smaller MxM matrix 
print TRUE if the smaller matrix can be found in the bigger matrix 
else print FALSE
Input:
3
4 5 9
1 3 5
8 2 4
2
3 5
2 4
Output : True

Input:
3
4 5 9
1 3 5
8 2 4
2
4 5
1 4
Output : False

Input:
11 12 13 14
21 22 23 24
31 32 33 34 
41 42 43 44
3
21 22 23
31 32 33
41 42 43
Output : True
*/
import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int m = sc.nextInt();
		int[][] temp = new int[m][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				temp[i][j]=sc.nextInt();
			}
		}
		
		int flag=0;
		outerLoop:
		for(int i=0;i<n-m;i++) {
			for(int j=0;j<n-m;j++) {
				if(arr[i][j]==temp[0][0]) {
					flag=0;
					nestedLoop:
					for(int i1=0;i1<m;i1++) {
						for(int j1=0;j1<m;j1++) {
							if(arr[i+i1][j+j1]!=temp[i1][j1]) {
								flag = 1;
								break nestedLoop;
							}	
						}
					}
					if(flag==0) {
						break outerLoop;
					}
				}
			}
		}
		if(flag==0)
			System.out.print("True");
		else
			System.out.print("False");		
	}
}
