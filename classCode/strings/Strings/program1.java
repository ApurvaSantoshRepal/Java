class stringdemo{

	public static void main(String[] args){
		String str1 ="Apurva";
		String str2="Apurva";
		String str3= new String ("Apurva");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

	}
}

