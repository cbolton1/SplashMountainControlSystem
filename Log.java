
public class Log {
	
	public int N = 5;
	public int M = 10;
	public boolean[] logFull = new boolean[N]; //each boolean is if a seat is full or not
	public Passenger[] people = new Passenger[M];
	public boolean clean = true;
	
	public boolean getLogFull(){
		for(int i = 0;i<logFull.length;i++){
			if(logFull[i]==false){
				return false;
			}
		}
		return true;
	}
	
}
