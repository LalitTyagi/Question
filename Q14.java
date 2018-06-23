/*
Print the numbers which are mismatched from two array. 
Arr1 = {a b c d e f g h i}
arr2 ={ a b d e e g g i i}, 
O/P-       cd, de, fg, hi.


a b c d e f g h i
a b d e e g g i i

*/
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr1 = new char[n];
		char[] arr2 = new char[n];
		
		for(int i=0;i<n;i++) {
			arr1[i]=sc.next().charAt(0);
		}
		for(int i=0;i<n;i++) {
			arr2[i]=sc.next().charAt(0);
		}
		
		for(int i=0;i<n;i++) {
			if(arr1[i]!=arr2[i]) {
				System.out.print(arr1[i]+""+arr2[i]+" ");
			}
			
		}
	}
}
