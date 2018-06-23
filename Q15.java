/*Given an array and a threshold value find the o/p

eg) i/p {5 8 10 13 6 2};threshold = 3;
      o/p  count = 17
      explanation:
Number	parts	            counts
5	    {3,2}                2
8       {3,3,2}              3
10      {3,3,3,1}            4
13      {3,3,3,3,1}          5
6       {3,3}                2
2       {2}                  1 
*/

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num,count=0;
		
		for(int i=0;i<n;i++) {
			num = sc.nextInt();
			count = count + (num/m);
			if(num%m != 0)
				count++;
		}
		System.out.println(count);
	}

}
