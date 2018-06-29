/*
Form a number system with only 3 and 4. Find the nth number of the number system. Eg.) The numbers are: 3, 4, 33, 34, 43, 44,
333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….
*/
import java.util.Scanner;
public class Q22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int x=10,m1=0,m2=2,count=2;
		
		int[] arr = new int[n];
		
		arr[0]=3;
		arr[1]=4;
		
		while(count!=n) {
			for(int i=m1;i<m2;i++) {
				arr[count]=3*x+arr[i];
				count++;
				if(count==n) {
					System.out.println(arr[count-1]);
					System.exit(0);
				}
			}
			for(int i=m1;i<m2;i++) {
				arr[count]=4*x+arr[i];
				count++;
				if(count==n) {
					System.out.println(arr[count-1]);
					System.exit(0);
				}
			}
			
			m1=m2;
			m2=count;
			x=x*10;
		}
		System.out.println(arr[count-1]);
	}
}
