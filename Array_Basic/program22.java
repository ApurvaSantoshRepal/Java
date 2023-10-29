/*
22] Exceptionally odd

Given an array of N positive integers where all numbers occur even number of
times except one number which occurs odd number of times. Find the exceptional
number.
Example 1:
Input:
N = 7
Arr[] = {1, 2, 3, 2, 3, 1, 3}
Output: 3
Explanation: 3 occurs three times.
Example 2:
Input:
N = 7
Arr[] = {5, 7, 2, 7, 5, 2, 5}
Output: 5
Explanation: 5 occurs three times.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^5
1 ≤ arr[i] ≤ 10^6

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
		System.out.println("Exceptionally odd number is : "+findExceptionallyOdd(arr));
		

	}
	static int findExceptionallyOdd(int arr[]){
		Arrays.sort(arr);
		int count=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1]){
				count++;
			}
			else{
				if(count%2==1){
					return arr[i-1];
				}
				else{   
					if(i==arr.length-1)

						return arr[i];
					}
					count=1;
				}
			}
		}
		return -1;




	}
}
