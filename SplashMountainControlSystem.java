public class SplashMountainControlSystem {

	public static int N = 5; //number of seats on a log
	public static int M = 20; //number of passengers available
	
	public static void main(String[] args) {
		//create log with n seats
		Log log1 = new Log();
		log1.initilizeLog(N);
		
		
		//Create an array of M passengers
		Passenger[] arrPassenger = new Passenger[M];
		for(int i = 0;i<arrPassenger.length;i++){
			arrPassenger[i] = new Passenger(i);
		}
		
		//Loop through the passengers so they all get a turn
		int inLine = M-1;
		while(inLine>-1){
			
			//if log is empty, it will be cleaned before the passengers can board
			if(log1.getLogFull()){
				log1.clean = false;
				System.out.println("Log dirty");
			}else{
				log1.cleanLog();
				//after log is cleaned start boarding
				for(int i = 0;i<N;i++){
					arrPassenger[inLine].board(log1);
					System.out.println("by passenger " + inLine);
					inLine--;
				}
				log1.ride();
				//Then riders get off
				for(int i = 0;i<N;i++){
					arrPassenger[i].disembark(log1);
				}
				
			}
			
			
			
		}
		

	}

}