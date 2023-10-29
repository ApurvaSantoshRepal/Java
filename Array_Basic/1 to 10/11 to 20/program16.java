/*
16] Last index of One
Given a string S consisting only '0's and '1's, find the last index of the '1' present in
it.
Example 1:
Input:
S = 00001
Output:
4
Explanation:
Last index of 1 in the given string is 4.

Example 2:
Input:
0
Output:
-1
Explanation:
Since, 1 is not present, so output is -1.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= |S| <= 10^6
S = {0,1}
*/

import java.io.*;
import java.util.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		String num = br.readLine();
               System.out.println("Last Index: "+lastIndexOfOne(num));


	}
	static int lastIndexOfOne(String num){
	
		for(int i=num.length()-1;i>=0;i--){
			if(num.charAt(i)=='1'){
				return i;
			}
		}

		return -1;



	}
}

