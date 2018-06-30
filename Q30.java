/* You’re given an even number n. If n=4, you have to print the following pattern :
4444
4334
4334
4444
If n=6, then the pattern should be like this :
666666
655556
654456
654456
655556
666666
*/
import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m=n;
		int i1,j1;
		
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n/2;i++) {
			i1=i;
			j1=i;
			
			while(j1<m) {
				arr[i1][j1]=m;
				j1++;
			}
			
			j1--;
			System.out.println(j1);
			while(i1<m) {
				arr[i1][j1]=m;
				i1++;
			}
			
			i1--;
			while(j1>=i) {
				arr[i1][j1]=m;
				j1--;
			}
			j1++;
			while(i1>=i) {
				arr[i1][j1]=m;
				i1--;
			}
			j1++;
			m--;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.print("\n");
		}
	}
}
