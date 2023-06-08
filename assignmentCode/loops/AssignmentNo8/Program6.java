//count no of digits
//
//
import java.io.*;
class DigitCount{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int count=0;
		while(num!=0){
			count++;
			num=num/10;
		}
		System.out.println(count);


	}



}
