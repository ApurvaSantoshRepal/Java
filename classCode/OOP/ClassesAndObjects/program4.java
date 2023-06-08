class BusStand{
       String nameOfStand = "Modnimb";
       int numberOfPassenger =256;
       void ticketCounter(){
	       int numberOfSolapurPassenger=23;
	       int availableSeatsOfSolapur =10;
	       String busName = new String("Shivneri");
	       System.out.println("Name of Bus stand : "+nameOfStand);
	       System.out.println("Avaliable Seats for Solapur : "+availableSeatsOfSolapur);
       }




}
class Passenger{
	public static void main(String[] args ){
		BusStand bs = new BusStand();
		bs.ticketCounter();
	}
}

