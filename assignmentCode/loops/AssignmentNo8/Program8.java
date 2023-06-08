//product of digits
//
//
import java.io.*;
class DigitsProduct{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int mul = 1;
		while (num != 0){
			int rem = num%10;
			mul = mul * rem ;
			num = num /10;
		}
		System.out.println(mul);
	}}
