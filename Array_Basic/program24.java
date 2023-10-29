/*
24] Ceil The Floor

Given an unsorted array Arr[] of N integers and an integer X, find floor and ceiling
of X in Arr[0..N-1].
Floor of X is the largest element which is smaller than or equal to X. Floor of X
doesn’t exist if X is smaller than the smallest element of Arr[].
Ceil of X is the smallest element which is greater than or equal to X. Ceil of X
doesn’t exist if X is greater than the greatest element of Arr[].
Example 1:
Input:
N = 8, X = 7
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
Output: 6 8
Explanation:
Floor of 7 is 6 and ceil of 7 is 8.

Example 2:
Input:
N = 8, X = 10
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
Output: 9 -1
Explanation:
Floor of 10 is 9 but ceil of 10 is not possible.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints :
1 ≤ N ≤ 10^5
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
		System.out.println("Enter the Nymber");
		int num = Integer.parseInt(br.readLine());
		ceilAndFloor(arr,num);

	}
	static void ceilAndFloor(int arr[],int num){
		int ceil=-1;
		int floor=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<num && floor>arr[i]){
				floor=arr[i];
			}
			if(arr[i]>num && ceil <arr[i]){
				ceil=arr[i];
			}
		}
		System.out.println("ceil :  " +ceil);
		System.out.println("Floor : "+floor);





	}
}

