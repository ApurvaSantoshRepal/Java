/*
21] First element to occur k times

Given an array of N integers. Find the first element that occurs at least K number
of times.
Example 1:
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
4
Explanation:
Both 7 and 4 occur 2 times.
But 4 is first that occurs 2 times
As at index = 4, 4 has occurred
at least 2 times whereas at index = 6,
7 has occurred at least 2 times.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 <= N <= 10^4
1 <= K <= 100
1<= A[i] <= 200
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
		System.out.println("Enter Key");
		int key = Integer.parseInt(br.readLine());
		System.out.println("First Element occur "+key+" times is "+firstElementOccursKTimes(arr,key));

	}
	static int firstElementOccursKTimes(int arr[],int key){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int data : arr){
			hm.put(data,hm.getOrDefault(data,0)+1);
			if(hm.get(data)==key){
				return data;
			}
		}
	        return -1;
	}
}

