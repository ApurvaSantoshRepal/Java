class Pattern8{
	public static void main(String[] args){
		char ch ='J';
		int num = 10;
		for (int i= 1;i<=4;i++){
			for (int j = 1;j<=i;j++){
				if (i%2==0){
					System.out.print(ch+" ");
					ch--;
					num--;

				}
				else{
					System.out.print(num+" ");
					ch--;
					num--;
				}
			}
			System.out.println();
		}
	}
}

