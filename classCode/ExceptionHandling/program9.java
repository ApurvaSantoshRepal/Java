import java.io.*;
class Demo {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int data = 0;
		try {
			data = Integer.parseInt(br.readLine());
			System.out.println(data);
		}
		catch(Exception obj){
			System.out.println("child class ");
		}
		catch(NumberFormatException obj1){//Error at this line beacuse in exception handling NumberformatExceptionclass is  child class of Exception class and we have to write child class in 1st catch block
			System.out.println("parent class");
		}
	}
}


