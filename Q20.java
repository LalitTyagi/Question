/*
Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.

w	e	L	C	O
M	E	T	O	Z
O	H	O	C	O
R	P	O	R	A
T	I	O	n	  
And print the start and ending index as 
Start index : 1,2 
End index: 3, 2
*/

import java.util.Scanner;

public class Q20 {
	public static void display(int sI,int eI,int sJ,int eJ){
		System.out.print("Start index.:");
		System.out.print(sI+",");
		System.out.println(sJ);
		System.out.print("End index  .:");
		System.out.print(eI+",");
		System.out.println(eJ);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		
		int n = (int)Math.sqrt(s.length()) + 1;
		int m = s1.length();
		char[][] arr = new char[n][n];
		int a = 0;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a<s.length()) {
					arr[i][j]= s.charAt(a);
					a++;
				}
			}
		}
		
		int count,sI,eI,sJ,eJ,found=0;
		
		outerloop1:
		for(int i=0;i<n;i++){
			for(int j=0;j<=n-m;j++){
				count = 1;
				if(s1.charAt(0)==arr[i][j]) {
					for(int k=1;k<m;k++) {
						if(s1.charAt(k)==arr[i][j+k]) {
							count++;
						}
						else {
							break;
						}
					}
					if(count == m) {
						sI=i;
						eI=i;
						sJ=j;
						eJ=j+m;
						found = 1;
						display(sI,eI,sJ,eJ);
						break outerloop1;
					}
				}
			}
		}
		
		if(found==0) {
			outerloop2:
				for(int j=0;j<n;j++){
					for(int i=0;i<=n-m;i++){
						count = 1;
						if(s1.charAt(0)==arr[i][j]) {
							for(int k=1;k<m;k++) {
								if(s1.charAt(k)==arr[i+k][j]) {
									count++;
								}
								else {
									break;
								}
							}
							if(count == m) {
								sI=i;
								eI=i+m-1;
								sJ=j;
								eJ=j;
								found = 1;
								display(sI,eI,sJ,eJ);
								break outerloop2;
							}
						}
					}
				}
		}
	}
}
