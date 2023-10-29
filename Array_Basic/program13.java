/*
13] Find unique element

Given an array of size n which contains all elements occurring in multiples of K,
except one element which doesn't occur in multiple of K. Find that unique element.
Example 1:
Input :
n = 7, k = 3
arr[] = {6, 2, 5, 2, 2, 6, 6}
Output :
5
Explanation:
Every element appears 3 times except 5.
Example 2:
Input :
n = 5, k = 4
arr[] = {2, 2, 2, 10, 2}
Output :
10
Explanation:
Every element appears 4 times except 10.
Expected Time Complexity: O(N. Log(A[i]) )
Expected Auxiliary Space: O( Log(A[i]) )
Constraints:
3<= N<=2*10^5
2<= K<=2*10^5
1<= A[i]<=10^9
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
		System.out.println("Enter K");
		int k = Integer.parseInt(br.readLine());

		System.out.println("Unique No ");
		uniqueNumber(arr,k);

	}
	static void uniqueNumber(int arr[] , int key){
		HashMap <Integer,Integer> hm= new HashMap<>();
		for(int data:arr){
			hm.put(data,hm.getOrDefault(data,0)+1);
		}
		hm.forEach((k,v)->{
			if(v%key != 0){
				System.out.println(k);
			}
		});
	
	}
}

