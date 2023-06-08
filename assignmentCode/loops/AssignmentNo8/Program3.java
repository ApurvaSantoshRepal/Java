//wap to print the divisor and count of divisior and entered number 
//input:15
//output:
//the divisors are  1 2 3 5 15
//the count of divisors is 4
//addition of divisors 24
//
import java.io.*;
class Divisors{
	static void divisor(int N){
		int count =0;
		int sum =0;
		System.out.print("The divisior are :");
		for (int i=1;i<=N;i++){
			if (N%i==0){
				System.out.print(i+" ");
				count++;
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("The count of divisors is "+count);
		System.out.println("Addition of divisor is "+sum);
	}


	
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:");
		int Number = Integer.parseInt(br.readLine());
		divisor(Number);
	}
}


