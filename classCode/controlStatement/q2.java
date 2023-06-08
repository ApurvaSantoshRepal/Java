//find maximum bet^n two numbers 
//inputs x = 5;
//y=3
//output = 5 is maximum
//input x= 5;
//y=5;
//output both are equal
class MaxNum{
	public static void main(String[] args){
		int x =5;
		int y=10;
		if (x>y){
			System.out.println(x+" is maximum");

		}
		else if(x==y){
			System.out.println("both are equal");
		}
		else{
			System.out.println(y+" is maximum");
		}
	}
}
