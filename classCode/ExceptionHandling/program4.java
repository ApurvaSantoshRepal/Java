//NullPointerException
class Demo{
	

	void m1(){
		System.out.println("m1");
	}
	void m2(){
		System.out.println("m2");
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.m1();
		obj = null;
	

		obj.m2();
	}
}

