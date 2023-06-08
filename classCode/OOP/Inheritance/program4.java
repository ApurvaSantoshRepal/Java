class Parent{
	int x=10;
	static int y = 20;
	static{
		System.out.println("Parent static Block");
	}
	Parent(){
		System.out.println("In Parent constructor");
	}
	void methodOne(){
		System.out.println(x);
		System.out.println(y);
	}
	static void methodTwo(){
		System.out.println(y);
	}
}
class Child extends Parent{

	static {
		System.out.println("In Child Ststic Block");
	}
	Child(){
		System.out.println("In Child Constructor");
	}
}
class Client {
	public static void main(String[] args){
		Child obj = new Child();
		obj.methodOne();
		obj.methodTwo();
	}
}


