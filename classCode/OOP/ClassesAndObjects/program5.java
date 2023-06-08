class Demo {
	static int x =10;

	static {
	System.out.println("Demo static block");
         System.out.println(x);

	}




}
class DemoMain{
	static {

		System.out.println("DemoMain Static Block");
	}


        public static void main(String[] args){
		System.out.println("before obj");
		Demo obj = new Demo();
		
		System.out.println("after obj");

	}


}
