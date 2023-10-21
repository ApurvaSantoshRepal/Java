import java.io.*;

class Demo{
	public static void main(String[] args){
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

		try{
		String str = br.readLine();
		}
		catch(IOException obj){
			System.out.println("IOException");
		}
		int data = 0;
		try{
			data = Integer.parseInt(br.readLine());
			System.out.println(data);
		}
		catch(NumberFormatException  | IOException io){
			System.out.println("number format exception Or IOException ");
		}
	}

}
