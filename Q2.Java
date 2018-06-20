//Alternate sorting: Given an array of integers, rearrange the array in such a way that the 
//first element is first maximum and second element is first minimum. 
// 
//    Eg.) Input  : {1, 2, 3, 4, 5, 6, 7} 
//         Output : {7, 1, 6, 2, 5, 3, 4}

import java.util.Scanner;
import java.util.Arrays;
 
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int l=0,m=n-1;
		for(int i=0;i<n-1;i=i+2) {
			System.out.print(arr[m]+" "+arr[l]+" ");
			l++;
			m--;
		}
		if(n%2==1) {
			System.out.print(arr[n/2]);
		}
	}
}
