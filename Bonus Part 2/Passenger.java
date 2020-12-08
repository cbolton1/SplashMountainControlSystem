/**
 * CIS 461 Project
 * 
 * Passenger class is a thread class that takes in the monitor, log, as well as the ticket machine, as a parameter, and then 
 * takes a ticket, boards, rides, and disembarks the ride. 
 */
public class Passenger implements Runnable {
	
	Log l;
	Ticket t;
	int ticket;
	
	public Passenger(Log log, Ticket tick) {
		l = log;
		t = tick;
	}
	
	
	public void run(){
		try {
			ticket = t.take();
			l.board(ticket);
			l.ride();
			l.disembark();
		} catch(InterruptedException e) {}
		
	}
}
