/*
Spiral printing.
Input : 4
Output:
4444444
4333334
4322234
4321234
4322234
4333334
4444444
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,num,m,size,x;
		num = sc.nextInt();
		n=num;
		size=(n*2)-1;
		x=size;
		int[][] arr = new int[size][size];
		
		int a,b;
		for(int i=0;i<n;i++){
		    a=i;
		    b=i;
		    while(b<size){
		        arr[a][b]=num;
		        b++;
		    }
		    b--;
		    while(a<size){
		        arr[a][b]=num;
		        a++;
		    }
		    a--;
		    while(b>i){
		        arr[a][b]=num;
		        b--;
		    }
		    while(a>i){
		        arr[a][b]=num;
		        a--;
		    }
		    num--;
		    size--;
		}
		
		for(int i=0;i<x;i++){
		    for(int j=0;j<x;j++){
		        System.out.print(arr[i][j]);
		    }
		    System.out.print("\n");
		}
	}
}
