//NumberFormatException
import java.io.*;
class Demo {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		System.out.println(x);
	}
}

