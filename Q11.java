/*
Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number
And sort the numbers based on the weight and print it as follows
<10,its_weight>,<36,its weight><89,its weight>
Should display the numbers based on increasing order.
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i=0;i<n;i++){
		    
		    int tempNum = (int)Math.sqrt(arr[i]);
		    if(arr[i]*arr[i] == tempNum*tempNum){
		        arr1[i]= 5;
		    }
		    else if((arr[i]%4==0)&&(arr[i]%6==0)){
    			arr1[i]=4;
    		}
    		else if(arr[i]%2==0){
    			arr1[i]=3;
    		}
    		else{
    			arr1[i]=1;
    		}
		}
		
		for(int i=0;i<n;i++){
		    System.out.println("<"+arr[i]+","+arr1[i]+">");
		}
    }
}
