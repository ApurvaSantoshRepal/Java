/*
12] First and last occurrences of X
Given a sorted array having N elements, find the indices of the first and last
occurrences of an element X in the given array.
Note: If the number X is not found in the array, return '-1' as an array.
Example 1:
Input:
N = 4 , X = 3
arr[] = { 1, 3, 3, 4 }
Output:
1 2
Explanation:
For the above array, first occurance of X = 3 is at index = 1 and last
occurrence is at index = 2.

Example 2:
Input:
N = 4, X = 5
arr[] = { 1, 2, 3, 4 }
Output:
-1
Explanation:
As 5 is not present in the array, so the answer is -1.
Expected Time Complexity: O(log(N))
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 10^5

0 <= arr[i], X <= 10^9
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
		System.out.println("Enter key: ");
		int key = Integer.parseInt(br.readLine());
		System.out.println("First Occurance: "+firstOccurance(arr,key));
		System.out.println("Last Occurance: "+lastOccurance(arr,key));

	}
	static int firstOccurance(int arr[] , int key){
		int left = 0;
		int right = arr.length;
		while(left<=right){
                      int mid = (left+right)/2;
		      if((mid==0|| arr[mid-1]<key) && arr[mid]==key){
			      return mid;
		      }
		      else if(arr[mid]<key){
			      left = mid+1;
		      }
		      else{
			      right = mid-1;
		      }
		}


		
		return -1;
	}


	static int lastOccurance(int arr[] , int key){
		int left=0;
		int right= arr.length;
		while(left<=right){
			int mid = (left+right)/2;
			if((mid==arr.length-1 || arr[mid+1]>key)&& arr[mid]==key){
				return mid;
			}
			else if (arr[mid]>key){
				right=mid-1;
			}
			else{
				left=mid+1;
			}
		}
		return -1;
	}


	
}

