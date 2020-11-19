import java.util.Arrays;

public class Log {
	
	public boolean[] logFull; //each boolean is if a seat is full or not
	public boolean clean = true;
	
	public void initilizeLog(int n){
		logFull = new boolean[n];
		System.out.println("Made new log with " + n + " seats");
	}
	
	public void ride(){
		System.out.println("Going for a ride");
	}
	
	//Call clean log to clean the log and make all seats available again
	public void cleanLog(){
		Arrays.fill(logFull, false);
		this.clean = true;
		System.out.println("log cleaned and ready for boarding");
	}
	
	
	public boolean getLogFull(){
		for(int i = 0;i<logFull.length;i++){
			if(logFull[i]!=true){
				System.out.println("log is not full");
				return false;
			}
		}
		System.out.println("log is full");
		return true;
	}
	
}
