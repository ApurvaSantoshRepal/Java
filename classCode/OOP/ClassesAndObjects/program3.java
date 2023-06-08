class ConstructorDemo{
	void fun(){
		System.out.println("inside the fun function");
		ConstructorDemo obj =new ConstructorDemo();
		System.out.println(obj);
	}
	public static void main(String[] args){
		System.out.println("inside main function");
		ConstructorDemo obj =  new ConstructorDemo();
	       System.out.println(obj);
	       obj.fun();

               }
}
//without constructor output of sop(obj)


