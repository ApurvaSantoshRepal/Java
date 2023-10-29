/*
14] Maximum repeating number

Given an array Arr of size N, the array contains numbers in range from 0 to K-1
where K is a positive integer and K <= N. Find the maximum repeating number in
this array. If there are two or more maximum repeating numbers return the element
having least value.
Example 1:
Input:
N = 4, K = 3
Arr[] = {2, 2, 1, 2}
Output: 2
Explanation: 2 is the most frequent element.
Example 2:
Input:
N = 6, K = 3
Arr[] = {2, 2, 1, 0, 0, 1}
Output: 0
Explanation: 0, 1 and 2 all have the same frequency of 2.But since 0 is
smallest, you need to return 0.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(K)
Constraints:
1 <= N <= 10^7
1 <= K <= N
0 <= Arri <= K - 1
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
		System.out.println("Maximum Repeating Element "+maxRepeatingNum(arr,key));


	}
	static int   maxRepeatingNum(int arr[] , int key){
		int freq[]=new int[key];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}
		int maxRep=0;
		int maxFreqNum=0;
		for(int i =0;i<key;i++){
			if(freq[i]>maxRep || (freq[i]==maxRep && i<maxFreqNum)){
				maxRep=freq[i];
				maxFreqNum=i;
			}
		}
		return maxFreqNum;


	}
}

