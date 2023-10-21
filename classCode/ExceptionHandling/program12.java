class Demo{
	static void fun(int x){
		System.out.println(x++);
		fun (x++);
	}
	public static void main(String[] args){
try {

		fun (1);
}
catch(StackOverflowError obj){
}
finally{
	System.out.println("StackOverFlowError");


	}
}
}

