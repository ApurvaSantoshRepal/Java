/*
41]Countries at war

The two countries of A and B are at war against each other. Both countries have N
number of soldiers. The power of these soldiers are given by A[i]...A[N] and
B[i]....B[N].
These soldiers have a peculiarity. They can only attack their counterpart enemies,
like A[i] can attack only B[i] and not anyone else. A soldier with higher power can
kill the enemy soldier. If both soldiers have the same power, they both die. You
need to find the winning country.
Example 1:
Input : a[ ] = {2, 2}, b[ ] = {5, 5}
Output : B
Explanation:
Both countries have 2 soldiers.
B[0] kills A[0], B[1] kills A[1].
A has 0 soldiers alive at the end.
B has both soldiers alive at the end.
Return "B" as a winner.
Example 2:
Input : a[ ] = {9}, b[ ] = {8}
Output : A
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ N ≤ 10^5
0 ≤ Ai ≤ 10^7
0 ≤ Bi ≤ 10^7

*/


import java.io.*
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

	}
}