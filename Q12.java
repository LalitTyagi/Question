/*
Input:
Number of elements in set1: 4
Elements are: 9, 9, 9, 9
Number of elements in set 2: 3
Elements are: 1,1,1
Output:
1, 0, 1, 1, 0

Input:
Number of elements in set1: 11
Elements are: 7,2,3,4,5,3,1,2,7,2,8
Number of elements in set 2: 3
Elements are: 1,2,3
Output: 7,2,3,4,5,3,1,2,8,5,1
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Number of elements in set1:");
		n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++){
		    arr1[i]=sc.nextInt();
		}
		System.out.println("Number of elements in set2:");
		m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i=0;i<m;i++){
		    arr2[i]=sc.nextInt();
		}
		
		int temp;
		if(n>m){
		    temp=n;
		}
		else{
		    temp=m;
		}
		
		int[] arrR = new int[temp+1];
		int tempA,tempB,tempR=0;
		for(int i=temp;i>=0;i--){
		    if(n-1>=0){
		        tempA=arr1[n-1];
		        n--;
		    }
		    else{
		        tempA=0;
		    }
		    if(m-1>=0){
		        tempB=arr2[m-1];
		        m--;
		    }
		    else{
		        tempB=0;
		    }
		    arrR[i]=(tempA+tempB+tempR)%10;
		    tempR = (tempA+tempB+tempR)/10;
		}
		if(arrR[0]!=0){
		    System.out.print(arrR[0]+",");
		}
		for(int i=1;i<temp+1;i++){
		    System.out.print(arrR[i]+",");
		}
	}
}
