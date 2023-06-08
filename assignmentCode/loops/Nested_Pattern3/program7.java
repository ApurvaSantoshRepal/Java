class Pattern7{
	public static void main(String[] args){
		char ch1='F';
		for (int i= 1;i<=4;i++){
			
			char ch2 = ch1;
			for (int j=1;j<=i;j++){
				System.out.print(ch2 +" ");
				ch2++;
			}
			ch1--;
			System.out.println();
		}
	}
}
