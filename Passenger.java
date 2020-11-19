public class Passenger {
	public static int passengerID;
	
	public Passenger(int id){
		passengerID = id;
	}
	
	public void board(Log l){
		//take the first available empty seat
		for(int i = 0;i<l.logFull.length;i++){
			//If the seat is empty take it
			if(l.logFull[i]==false){
				l.logFull[i] = true;
				System.out.println("seat " + i + " is taken");
			}
		}
	}
	
	public void disembark(Log l){
		//exit from the first taken seat
		for(int i = 0;i<l.logFull.length;i++){
			//if the seat is taken, free it up
			if(l.logFull[i]==true){
				l.logFull[i] = false;
				System.out.println("seat " + i + " is open");
			}
		}
	}
}