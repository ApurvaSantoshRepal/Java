class ConstructorDemo{
	ConstructorDemo(){
		System.out.println("Inside Constructor");
	}
	void function1(){
		ConstructorDemo obj = new ConstructorDemo();
		System.out.println(obj);
	}
	public static void main(String[] args){
	  ConstructorDemo obj1 = new ConstructorDemo();
	  System.out.println(obj1);
	  ConstructorDemo obj2 = new ConstructorDemo();
	  System.out.println(obj2);
	  obj1.function1();
	}
}

