/*

7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1

*/

import  java.io.*;
class Solution{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		System.out.println(reverse(x));
	}
	static int reverse(int x){
		long num=0;
		while(x!=0){
			int rem = x%10;
			num = num*10+rem;
			x=x/10;
		}
		if(num>Integer.MAX_VALUE || num <Integer.MIN_VALUE){
			return 0;
		}
		return (int)num;
	}
}

