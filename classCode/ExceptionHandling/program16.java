class Demo{
	public static void main(String[] args){
		try{
			throw 10;
		}
		catch (int x){
			System.out.println("work");
		}
	}
}

