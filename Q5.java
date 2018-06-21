/*
2.Given sorted array check if two numbers sum in it is a given value
Input
Array = {1 3 4 8 10 } N = 7
output
true
*/

import java.util.*;

public class Q5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int num = sc.nextInt();
		int count = 0;
		
		for(int j=0;j<n;j++){
		    if(arr[j]<num)
		        count++;
		}
		
		
		for(int i=0;i<count-1;i++){
		    for(int j=i+1;j<count;j++){
		        if(arr[i]+arr[j]==num){
		            System.out.print("TRUE");
		            System.exit(0);
		        }
		    }
		}
		System.out.print("False");
	}
}
