import java.util.*;
import java.io.*;



class DataOverFlowException extends IOException{
	DataOverFlowException(String msg){
		super(msg);
	}
}
class DataUnderFlowException extends IOException{
}
class DemoException{
	public static void main(String[] args)throws DataUnderFlowException,DataOverFlowException{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x>100){
			throw new DataOverFlowException("Data OverFlow hotoy");
		}
		if (x<0){
			throw new DataUnderFlowException();
		}
	}
}

