/*
23] Find the smallest and second smallest element in an array

Given an array of integers, your task is to find the smallest and second smallest
element in the array. If smallest and second smallest do not exist, print -1.
Example 1:
Input :
5
2 4 3 5 6
Output :
2 3
Explanation:
2 and 3 are respectively the smallest
and second smallest elements in the array.
Example 2:
Input :
6
1 2 1 3 6 7
Output :
1 2
Explanation:
1 and 2 are respectively the smallest
and second smallest elements in the array.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1<=N<=10^5
1<=A[i]<=10^5
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
		System.out.println("First and second smallest numbers are: ");
		firstAndSecondSmallest(arr);

	}
	static void firstAndSecondSmallest(int arr[]){
		int firstSmallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(firstSmallest>arr[i]){
				secondSmallest=firstSmallest;
				firstSmallest=arr[i];
			}
		}
		System.out.println("First Smallest Number is : "+firstSmallest);
		System.out.println("Second Smallest Number is : "+secondSmallest);


	}
}

