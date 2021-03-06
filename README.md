# Question
Q1.Print the word with odd letters as
```
Eg.) Input : PROGRAM
     Output : 
            P     M
             R   A
              O R
               G
              O R
             R   A
            P     M
```

Q2.Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum. 
```
 Eg.) Input  : {1, 2, 3, 4, 5, 6, 7} 
      Output : {7, 1, 6, 2, 5, 3, 4}
```

Q3.Write function to find multipication of 2 numbers using + operator You must use minimu possible iterations.
```
Input: 3 , 4
Output 12
```

Q4. Given a 9×9 sudoku we have to evaluate it for its correctness. We have to check both the sub matrix correctness and the whole sudoku correctness.
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

Q5.Given sorted array check if two numbers sum in it is a given value
```
Input
Array = {1 3 4 8 10 } N = 7
OUTPUT: TRUE
```

Q6.Given an array of positive integers. The output should be the number of occurrences of each number.
```
Input: {2 3 2 6 1 6 2}
Output:
1 – 1
2 – 3
3 – 1
6 – 2
```

Q7.Given an odd length word which should be printed from the middle of the word.
```
Example:
Input: PROGRAM
The output should be in the following pattern:
	      G
            GR
          GRA
       GRAM
     GRAMP
   GRAMPR
GRAMPRO
```

Q8.You’re given an array. Print the elements of the array which are greater than its previous elements in the array.
```
Input : 2 -3 -4 5 9 7 8    
Output: 5 9 8
You should solve this question in O(n) time.
```

Q9. You’re given a number n. 
If write all the numbers from 1 to n in a paper, we have to find the number of characters written on the paper.
For example if n=13, the output should be 17 if n = 101, the output should be 195

Q10.Write a program to print the below pattern
```
Input: n = 6
Output:
1	7	12	16	19	21
2	8	13	17	20
3	9	14	18	
4	10	15
5	11	
6 
```

Q11. Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number
And sort the numbers based on the weight and print it as follows
<10,its_weight>,<36,its weight><89,its weight>
Should display the numbers based on increasing order.

Q12.
```
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
```

Q13.Spiral printing.
```
Input : 4
Output:
4444444
4333334
4322234
4321234
4322234
4333334
4444444
```

Q14.Print the numbers which are mismatched from two array. 
```
Arr1 = {a b c d e f g h i}
arr2 ={ a b d e e g g i i}, 
O/P-       cd, de, fg, hi
```

Q15.Given an array and a threshold value find the o/p
```
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
```

Q16.Given two numbers a and b both < 200 we have to find the square numbers which lie between a and b(inclusive)
```
eg) i/p a = 20;b = 100;
      o/p 25,36,49,64,81,100 
 ```
 
 Q17.Given two sorted arrays, merge them such that the elements are not repeated
```
Eg 1: Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 
8
10
2 4 5 6 7 9 10 13
2 3 4 5 6 7 8 9 11 15
2 3 4 5 6 7 8 9 10 11 13 15
```

Q18.Rotate nXn Matrix 90 degree,180 degree, 270 degree, 360 degree.

Q19.Find if the matrix is available after the rotation.

-----------------------------------------------

Q20. Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.
```
w	e	L	C	O
M	E	T	O	Z
O	H	O	C	O
R	P	O	R	A
T	I	O	n	  
```
And print the start and ending index as
Start index : <1,2>
End index: <3, 2>

Q21. Remove unbalanced parentheses in a given expression.
```
    Eg.) Input  : ((abc)((de))
         Output : ((abc)(de))  

         Input  : (((ab)
         Output : (ab) 
```
Q22. Form a number system with only 3 and 4. Find the nth number of the number system.
Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….

Q23. Check whether a given mathematical expression is valid.
```
         Input  : (a+b)(a*b)
         Output : Valid

         Input  : (ab)(ab+)
         Output : Invalid

         Input  : ((a+b)
         Output : Invalid 
```

Q24. Given bigger NxN matrix and a smaller MxM matrix print TRUE if the smaller matrix can be found in the bigger matrix else print FALSE
```
Input:
3
4 5 9
1 3 5
8 2 4
2
3 5
2 4
Output : True

Input:
3
4 5 9
1 3 5
8 2 4
2
4 5
1 4
Output : False

Input:
11 12 13 14
21 22 23 24
31 32 33 34 
41 42 43 44
3
21 22 23
31 32 33
41 42 43
Output : True
```

Q25. Given an array, print all duplicate values. If no duplicates found print -1.
```
Input:12,13,14,12,125,24,24,12
Output:12,24  
Input:7,9,1,21 
Output:-1  
Input:32,6,12,45,12 
Output:12 
```

Q26. Given a linkedlist, reverse and print the list. The program should run with O(n) time and space complexity
```
Input:10 -> 20 -> 30 -> 40 -> NULL  
Output:40 -> 30 -> 20 -> 10 -> NULL 
```

Q27: Given a string, reverse only the characters in it, any numbers present should hold the same position
```
Input:qowocorp123 
Output:procowoq123
Input:qowo123corp 
Output:proc123owoq 
Input:qow123ocorp 
Output:pro123cowoq
Input:a1b2cd3 
Output:d1c2ba3  
```

Q28. Write a program to give the following output for the given input
```
Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
```

Q29. For any given matrix find the path from the start to the end which gives the maximum sum. Traverse only right or down.
Example: starting index is 15 (left top) and ending index is 10 (bottom right)
```
15 25 30
45 25 60
70 75 10
O/P:15->45->70->75->10 sum is 215
```

Q30. You’re given an even number n. If n=4, you have to print the following pattern :
```
4444
4334
4334
4444
If n=6, then the pattern should be like this :
666666
655556
654456
654456
655556
666666
```

Q31.Help john to find new friends in social network
```
Input:3
mani 3 ram raj guna
ram 3 kumar Kishore guna
mughil 3 praveen Naveen Ramesh
Output:
Raj guna kumar Kishore praveen Naveen Ramesh
```

Q32.Find the union intersection of two list and also find except (remove even elements from list1 and odd elements from list2)
```
Input :7 
1 3 4 5 6 8 9
5
1 5 8 9 2
List 1: 		1,3,4,5,6,8,9
List 2: 		1,5,8,9,2

Union: 			1,3,4,5,6,8,9,2
Intersection: 	        1,5,8,9
Except: 		1,3,5,9,8,2 
```

Q33. Given unsorted array find all combination of the element for a given sum. Order should be maintained.
```
Input : 8 3 4 7 9 N=7
Output : {3 4 } {7}
```

Q34. Given an array, find the minimum of all the greater numbers for each element in the
array.
 ```  
Sample: 
Array : {2 3 7 ­1 8 5 11} 
   
Output: 
{2­>3, 3­>5, 7­>8, ­1­>2, 8­>11, 5­>7, 11­>} 
```

Q35.Print the given pattern:
```
Input:
N= 3, M=3
Output:
X X X
X 0 X
X X X
N=4 M=5
Output:
X X X X
X 0 0 X
X 0 0 X
X 0 0 X
X X X X
Input:
N=6 M=7
X X X X X X
X 0 0 0 0 X
X 0 X X 0 X
X 0 X X 0 X
X 0 X X 0 X
X 0 0 0 0 X
X X X X X X
```

Q36.Using Recursion reverse the string such as
```
Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I 
```

Q37. Given a few pairs of names in the order child, father. The input is a person name and level number. 
The output should be the number of children or grand children in that particular level for the person given.
Example:
```
Input:
[
{Ram, Syam},
{Akil, Syam},
{Nikil, Ram},
{Subhash, Ram},
{Karthik, Akil}
];
Syam 2
Output: 3 (Syam has Ram and Akil in level 1 and in level 2 he have Nikil, Subhash, Karthik. So the answer is 3).
```
```
Input:
[
{Lava, kusha},
{Rama, Lava},
{Lava, Ravanan},
{Abi, Lava},
];
I/P: Ravanan
O/P: 2
```
```  
Input:
[
{luke, shaw},
{wayne, rooney},
{rooney, ronaldo},
{shaw, rooney},
];
I/P: ronaldo
O/P: 2
```

Q38.Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
```
Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1
```

Q39.Arrange the numbers in descending order depending on the no. of factors available for each number.
```
I/P: {6,8,9}
O/P: {8,6,9} or {6,8,9}
Reason: factors of 8 (1,2,4,8), factors of 6 (1,2,3,6), factors of 9 (1,3,9).
```

--------------------------------
Q1. Given a string, replace all duplicates witht the next character.
```
java114 --> javb124
BusRoute112 --> BusRovte123
aBuzZ9900 --> aBuzC9012
Rules:  
Replace uppercase characters with next uppercase character, replace lowercase with lowercase  
Replace z --> a, Z --> A, 9 --> 0  
If the next character already exists, replace the next character  
aBuzZ9900 -- replace Z with A  
As 'a' exists, replace with next character -- B  
As 'B' exists, replace with next character -- C  
aBuzC9900 --- replace 9 with 0  
aBuzC9000 --- replace 0 with 1  
aBuzC9010 --- replace 0 with 2, as 1 already exists.
O/P --> aBuzC9012
```

q2.A matrix game was given with 5 rules. We were asked to implement each of the rules separately.
```
  R3 | -   -   - |
  R2 | -   -   - |
  R1 | -   -   - |
       C1  C2  C3  
```
Each of the 9 cells can either be empty or filled with an atom. R3, R2, R1 are the rays that originate from the left. C1, C2, C3 are the rays that originate from the bottom of the box.

Input : Position of the atoms and the rays that gets originated from the outside of the box.
```
  Eg.) 3
       3 1
       2 2
       1 3
       3
       R3 C1 C3
```
Output  : Print the box. 

Rule 1:
A ray that has an atom in its path should print ‘H’ (Hit) If it does not have any atoms in its path, the ray should pass to the other side.
```
       C1      C3
  R3 | -   -   - | R3
  H  | -   X   - |
  R1 | -   -   - | R1
       C1  H   C3 
```
Rule 2 & 3:
A ray that has an atom in its diagonal adjacent position should refract.
```
  H  | -   -   - |
  H  | X   -   - |
  R  | -   X   - |
       R   H   R  
```
Input rays: R1, R2, C3
```
  H  | -   X   - |
  R2 | -   -   - | C3
     | -   -   - |
       R2      C3  
```
Rule 4:
A ray that has atoms in both of the diagonal adjacent positions should reflect back.

```
Input ray: C2
   | -   -   - |
   | X   -   X |
   | -   -   - |
         R   
```
```
Input ray: R2
     | -   X   - |
  R  | -   -   - |
     | -   X   - | 
```
Rule 5:
The deflection of rays should happen in the order of the input rays.
```
Input Rays: R3, R2, C1, C3
   H | -   X   - |
  R2 | -   -   - | C3
     | -   -   - |
       R2      C3 
```
The final task was to implement these rules for dynamic matrix size.


Input : no of rows, no of columns
  Eg.) 4 4 (row & column)
       2 (No of atoms)
       4 4 (Position of atom)
       2 2 (Position of atom)
       2 (No of rays)
       R4 C2 (Ray number)
```
  H  | -   -   -   X |
     | -   -   -   - |
     | -   X   -   - |
     | -   -   -   - |
           H  
```
The final task was very confusing and it had to handle all the cases. There are chances for a ray to end at the starting position if the number of rows and columns are more than 5.

Q3. Design a Call taxi booking application
-There are n number of taxi’s. For simplicity, assume 4. But it should work for any number of taxi’s.   
-The are 6 points(A,B,C,D,E,F)   
-All the points are in a straight line, and each point is 15kms away from the adjacent points.    
-It takes 60 mins to travel from one point to another    
-Each taxi charges Rs.100 minimum for the first 5 kilometers and Rs.10 for the subsequent kilometers.    
-For simplicity, time can be entered as absolute time. Eg: 9hrs, 15hrs etc.    
-All taxi’s are initially stationed at A.    
-When a customer books a Taxi, a free taxi at that point is allocated    
-If no free taxi is available at that point, a free taxi at the nearest point is allocated.    
-If two taxi’s are free at the same point, one with lower earning is allocated    
-Note that the taxi only charges the customer from the pickup point to the drop point. Not the distance it travels from an adjacent point to pickup the customer.     
-If no taxi is free at that time, booking is rejected     
     
Design modules for     
```   
1)    Call taxi booking 
Input 1:
Customer ID: 1
Pickup Point: A
Drop Point: B
Pickup Time: 9
    
Output 1:
Taxi can be allotted.
Taxi-1 is allotted
```
```
Input 2:
Customer ID: 2
Pickup Point: B
Drop Point: D
Pickup Time: 9

Output 1:
Taxi can be allotted.
Taxi-2 is allotted 
```
(Note: Since Taxi-1 would have completed its journey when second booking is done, so Taxi-2 from nearest point A which is free is allocated)
```
Input 3:
Customer ID: 3
Pickup Point: B
Drop Point: C
Pickup Time: 12

Output 1:
Taxi can be allotted.
Taxi-1 is allotted 
```
2) Display the Taxi details
```
Taxi No:    Total Earnings:
BookingID    CustomerID    From    To    PickupTime    DropTime    Amount
```  
Output:
```
Taxi-1    Total Earnings: Rs. 400
1    1    A    B     9    10    200
3    3    B    C    12    13    200
```
```
Taxi-2 Total Earnings: Rs. 350
2    2    B    D    9    11    350 
```
These were just sample inputs. It should work for any input that they give.
Those who finished both the modules within 3 hours and if it worked for all the inputs they give, those candidates were given extra modules to work with.

