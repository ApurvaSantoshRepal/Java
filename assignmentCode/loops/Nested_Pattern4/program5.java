class Pattern5{
	public static void  main(String[] args){
		char ch = 'A';
		for (int i = 1;i<=4;i++){
			char ch1 = ch;
			for(int j=1;j<=4+1-i;j++){
				System.out.print(ch1 +" ");
				ch1++;
			}
			ch++;
			System.out.println();
		}
	}
}


