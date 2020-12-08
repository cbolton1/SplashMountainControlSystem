/**
 * CIS 461 Project part 2
 * 
 * SplashMountainControlSystem sets up how many seats the ride has, how many passengers there are, and the max number of tickets.
 * Then, it sets up an instance of the monitor Log and Ticket, then generates and starts m Passenger threads, which then independently 
 * run to show the behavior of the system.
 */
public class SplashMountainControlSystem {

	public static void main(String[] args) {
		int n = 6;
		int m = 18;
		int t = 8;
		System.out.println("How many seats in the ride? (n = "+n+")");
		
		System.out.println("How many passengers total? (m = "+m+")");
		
		System.out.println("How many tickets total? (t = "+t+")");
		
		
		Log log1 = new Log(n, t);
		Ticket tick1 = new Ticket(t);
		
		//generates array of size m, then initializes and starts m threads
		Thread passengers[] = new Thread[m];
		for(int x = 0; x < m; x++){
			passengers[x] = new Thread(new Passenger(log1, tick1));
		}
		for(int x = 0; x < m; x++){
			passengers[x].start();
		}
	}
}
