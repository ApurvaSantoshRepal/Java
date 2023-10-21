class Demo{
	public static void main(String[] args){
		System.out.println("Main Start");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException obj){
			System.out.println("ArithmeticException");
		}
		System.out.println("main End");
	}


}

   
