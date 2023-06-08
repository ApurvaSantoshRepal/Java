//reverce the no
//
import java.io.*;
class ReverseNumber{
	public static void main(String[] args )throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int rev=0;

		while (num!=0){
			int rem = num %10;
			 rev = rev*10+rem;
			num = num /10;
		}
		System.out.println(rev);
	}
}

