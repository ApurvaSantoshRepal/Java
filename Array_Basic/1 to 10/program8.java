/*
8] Even occurring elements
Given an array Arr of N integers that contains an odd number of occurrences for all
numbers except for a few elements which are present even number of times. Find
the elements which have even occurrences in the array.
Example 1:
Input:
N = 11
Arr[] = {9, 12, 23, 10, 12, 12,
15, 23, 14, 12, 15}
Output: 12 15 23
Example 2:
Input:
N = 5
Arr[] = {23, 12, 56, 34, 32}
Output: -1
Explanation:
Every integer is present odd number of times.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^5
0 ≤ Arr[i] ≤ 63

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
		evenOccurance(arr);
	}
	static void evenOccurance(int arr[]){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int data:arr){
			hm.put(data,hm.getOrDefault(data,0)+1);
		}
		System.out.println("Output");
		hm.forEach((k,v)->{
			if(v%2==0){
				System.out.println(k+" ");
			}
		});
	}

}

