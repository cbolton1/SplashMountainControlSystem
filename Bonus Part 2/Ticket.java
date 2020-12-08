/**
 * CIS 461 Project part 2
 * 
 * Ticket, as a class, models the ticket machine in the model. It is initialized with a max number of tickets, and then
 * individual passengers take the next ticket in line, wrapping back around to ticket 1 when the max is hit.
 */
public class Ticket {
	private int tick;
	private int max;
	
	public Ticket(int t) {
		tick = 0;
		max = t;
	}
	
	//Increments and wraps tickets, then assigns to next passenger. Is synchronized to prevent interleaving
	public synchronized int take() {
		tick %= max;
		tick++;
		return tick;
	}
}
