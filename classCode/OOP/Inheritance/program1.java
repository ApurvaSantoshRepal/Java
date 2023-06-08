class Google{
	Google(){
		System.out.println("Google");
		System.out.println(this);
	}
	void info(){
		System.out.println("in info function");
		System.out.println(this);
	}
}
class GoogleDrive extends Google {
	GoogleDrive(){
		System.out.println("Google Drive");
		System.out.println(this);
	}
}
class Client{
	public static void main(String[] args){
		GoogleDrive obj = new GoogleDrive();
		obj.info();
		System.out.println("Client");
		System.out.println(obj);
	}
}

