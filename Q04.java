//Given a 9×9 sudoku we have to evaluate it for its correctness. We have to check both the sub matrix correctness and the whole sudoku correctness.
```
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9


3 1 6 5 7 8 4 9 2
5 2 9 1 3 4 7 6 8
4 8 7 6 2 9 5 3 1
2 6 3 4 1 5 9 8 7
9 7 4 8 6 3 1 2 5
8 5 1 7 9 2 6 4 3
1 3 8 9 4 7 2 5 6
6 9 2 3 5 1 8 7 4
7 4 5 2 8 6 3 1 9
```

import java.util.*;

public class Q4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		
		for(int i=0;i<9;i++){
		    for(int j=0;j<9;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		
		int count;
		
		for(int i=0;i<9;i++){
		    count=0;
		    for(int j=0;j<9;j++){
		        count=count+arr[i][j];
		    }
		    if(count!=45){
		        System.out.print("Sudoku is not correct");
		        System.exit(0);
		    }
		}
		
		for(int j=0;j<9;j++){
		    count=0;
		    for(int i=0;i<9;i++){
		        count=count+arr[i][j];
		    }
		    if(count!=45){
		        System.out.print("Sudoku is not correct");
		        System.exit(0);
		    }
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				count=0;
				for(int k=0;k<3;k++)
				{
					for(int l=0;l<3;l++)
					count=count+arr[i*3+k][j*3+l];
				}
				
				if(count!=45)
				{
					System.out.print("Sudoku is not correct");
		            System.exit(0);
				}
			}
			
			
		}
	}
}
