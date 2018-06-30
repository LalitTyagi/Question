/*
 Find the union intersection of two list and also find except 
 (remove even elements from list1 and odd elements from list2)

Input :7 
1 3 4 5 6 8 9
5
1 5 8 9 2
List 1: 		1,3,4,5,6,8,9
List 2: 		1,5,8,9,2

Union: 			1,3,4,5,6,8,9,2
Intersection: 	1,5,8,9
Except: 		1,3,5,9,8,2 
 */
import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int j=0;j<m;j++) {
			arr2[j]=sc.nextInt();
		}
		
		System.out.print("Union: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		for(int j=0;j<m;j++) {
			int flag = 0;
			for(int i=0;i<n;i++) {
				if(arr1[i]==arr2[j]) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.print(arr2[j]+" ");
		}
		
		
		System.out.print("\nIntersection: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					break;
				}
			}
		}
		
		System.out.print("\nExcept: ");
		for(int i=0;i<n;i++) {
			if(arr1[i]%2==1)
				System.out.print(arr1[i]+" ");
		}
		for(int j=0;j<m;j++) {
			if(arr2[j]%2==0)
				System.out.print(arr2[j]+" ");
		}
	}
}
