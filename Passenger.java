
public class Passenger {

	public void board(Log l){
		//take the first available empty seat
		for(int i = 0;i<l.logFull.length;i++){
			//If the seat is empty take it
			if(l.logFull[i]==false) l.logFull[i] = true;
		}
	}
	
	public void ride(){
		
	}
	
	public void disembark(){
		
	}
}
