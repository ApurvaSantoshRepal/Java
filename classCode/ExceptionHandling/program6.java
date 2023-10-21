//stream closed

import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	br.close();
	BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	String str1 = br1.readLine();
	}
}


