/*
1. Two Sum
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

*/

import java.io.*;
class Solution{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter target ");
		int target=Integer.parseInt(br.readLine());
		int output[]=twoSum(arr,target);
		System.out.println("output");
		for(int i=0;i<output.length;i++){
			System.out.println(output[i]);
		}
	}
	static int[] twoSum(int arr[] ,int target){
		int[] output=new int[2];
		int k=0;
		for(int i = 0;i<arr.length-1;i++){
			for(int j =i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==target){
					output[k++]=i;
					output[k++]=j;
				}
			}
		}
		return output;




	}
}
