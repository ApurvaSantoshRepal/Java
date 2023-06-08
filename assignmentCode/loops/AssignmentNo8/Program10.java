//fibonacci series
//
//
import java.io.*;
class Fibonacci{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());


		int num1 = 0;
		int num2 = 1;
		int temp=0;
		while (temp<=num){
			System.out.print(temp+" ");
			temp = num1+num2;
			num2=num1;
			num1=temp;
		}
		System.out.println();
	}
}
			

