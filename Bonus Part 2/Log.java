/**
 * CIS 461 Project part 2
 * 
 * Log class is a monitor class that synchronizes and controls Passenger threads to 
 * force them to board one at a time, in the order of their tickets, limits them at n seats at a time, and rides when n riders
 * have gotten on, which "dirties" the ride. Finally the passengers disembark, the ride is cleaned, and the state returns 
 * to the initial state, removing the riders that have ridden already.
 */

public class Log {
	
	private int n; //number of seats on ride
	private int logFull = 0; //Keeps track of how many people are in the ride at the moment
	private int tick = 1; //Keeps track of next ticket in line
	private int tickMax; //Max num of tickets
	private boolean clean = true;
	private int ridden  = 0; //Keeps track if all of the threads have "ridden" yet
	
	public Log(int seats, int t){
		n = seats;
		tickMax = t;
	}
	
	//Passenger can board as long as there are empty spaces and the ride has been cleaned, and they have the correct ticket
	public synchronized void board(int t) throws InterruptedException{
		while(logFull == n || !clean || t != tick){
			wait();
		}
		logFull++;
		System.out.println("Passenger "+logFull+", with ticket " + tick + " has boarded!");
		tick %= tickMax;
		tick++;
		notifyAll();
	}
	
	//Ride launches once it has been filled, "dirtying" the ride afterwards
	public synchronized void ride() throws InterruptedException{
		while(logFull < n) {
			wait();
		}
		notifyAll();
		ridden++;
		if(ridden == n) {
			System.out.println("Riding...");
			clean = false;
		}
	}
	
	//After riding, people disembark, then the ride is cleaned, and people are free to board again
	public synchronized void disembark() throws InterruptedException{
		while(clean) {
			wait();
		}
		System.out.println("Passenger "+logFull+" has disembarked!");
		logFull--;
		if(logFull == 0){
			System.out.println("All passengers have disembarked! Cleaning...");
			clean = true;
			ridden = 0;
			notifyAll();
		}
	}
	
}

