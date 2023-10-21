import java.io.*;
class Demo{
	public static void main(String[] args){
		for (int i = 1;i<=10;i++){
			System.out.println(i);
			try{

			Thread.sleep(1000);
			}
			catch(RuntimeException obj){
				System.out.println("RuntimeException occurs");
			}
			catch(InterruptedException ie){
				System.out.println("Interrupted Exception");
			}
		}
	}
}

