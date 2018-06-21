/*

You’re given a number n. 
If write all the numbers from 1 to n in a paper, we have to find the number of characters written on the paper.
For example if n=13, the output should be 17 if n = 101, the output should be 195

*/

import java.util.*;

public class Q9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int num;
		for(int i=1;i<=n;i++){
		    num=i;
		    while(num!=0){
		        count++;
		        num = num/10;
		    }
		}
		System.out.print(count);
    }
}
