/*
7] Form largest number from digits

Given an array of numbers from 0 to 9 of size N. Your task is to rearrange elements
of the array such that after combining all the elements of the array, the number
formed is maximum.
Example 1:
Input:
N = 5
A[] = {9, 0, 1, 3, 0}
Output:
93100
Explanation:
Largest number is 93100 which can be formed from array digits.
Example 2:
Input:
N = 3
A[] = {1, 2, 3}
Output:
321

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 <= N <= 10^7
0 <= Ai <= 9
*/


import java.io.*;
import java.util.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array");
		int size = Integer.parseInt(br.readLine());
                System.out.println("Enter Elements in the array");
		int arr[]=new int[size];
		for(int i = 0;i<size;i++){

			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Largest Number formed : "+largestNum(arr));
		

	}
	static int largestNum(int arr[]){
		Arrays.sort(arr);
		int num= 0;
		for(int i=arr.length-1;i>=0;i--){
			num = (num+arr[i])*10;
		}
		return num;
	}


}

