//sum of digits
//
import java.io.*;
class DigitsSum{
	public static void main(String[] args)throws IOException{
 		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int sum=0;
		while(num!=0){
			int rem = num%10;
			sum= sum + rem;
			num= num/10;
		}
		System.out.println("Digit sum is : "+sum);



	}



}

