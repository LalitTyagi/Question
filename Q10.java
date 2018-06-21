/*
5.Write a program to print the below pattern

for n = 6
1	7	12	16	19	21
2	8	13	17	20
3	9	14	18	
4	10	15
5	11	
6 

*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=n;
		int num;
		for(int i=1;i<=n;i++){
		    num=i;
		    for(int j=0;j<count;j++){
		        System.out.print(num+" ");
		        num= num+(n-j);
		    }
		    count--;
		    System.out.println("\n");
		}
    }
}
