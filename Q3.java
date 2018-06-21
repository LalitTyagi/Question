/*Write function to find multipication of 2 numbers using + operator You must use minimu possible iterations.

Input: 3 , 4
Output 12

*/

import java.util.*;

public class Q3{
    public static int multiply(int a,int b){
       if(a==0 || b==0) return 0;
    
       if(b>0)
       {
          return a+multiply(a,--b);
       }
       else
       {
          a=-a;
          b=-b;
          return multiply(a,b);
       }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print(multiply(a,b));
	}
}
