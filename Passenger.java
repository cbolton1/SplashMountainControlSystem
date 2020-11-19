
/**
 * CIS 461 Project
 * 
 * Passenger class is a thread class that takes in the monitor, log, as a parameter, and then 
 * boards, rides, and disembarks the ride. 
 */
public class Passenger implements Runnable {
	Log l;
	
	public Passenger(Log log) {
		l = log;
	}
	
	
	public void run(){
		try {
			l.board();
			l.ride();
			l.disembark();
		} catch(InterruptedException e) {}
		
	}
}
